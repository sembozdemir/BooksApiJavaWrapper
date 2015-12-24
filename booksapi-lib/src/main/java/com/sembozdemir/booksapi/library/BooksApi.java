package com.sembozdemir.booksapi.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sembozdemir.booksapi.library.models.Item;
import com.sembozdemir.booksapi.library.models.Result;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class BooksApi {
    public static final String BASE_URL = "https://www.googleapis.com/books/v1/";
    private static final String KEY_RELEVANCE = "relevance";
    private static final String KEY_NEWEST = "newest";
    private static final String KEY_BOOKS = "books";
    private static final String KEY_MAGAZINES = "magazines";
    private BooksApiService booksApiService;
    private String apiKey;
    private int maxResults;

    public BooksApi(BooksApiService booksApiService, String apiKey) {
        this.booksApiService = booksApiService;
        this.apiKey = apiKey;
        maxResults = 10; // default
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        if (maxResults > 40) {
            this.maxResults = 40;
        } else if (maxResults < 1) {
            this.maxResults = 1;
        } else {
            this.maxResults = maxResults;
        }
    }

    public static BooksApi create(String googleBooksApiKey) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        BooksApiService booksApiService = retrofit.create(BooksApiService.class);

        return new BooksApi(booksApiService, googleBooksApiKey);
    }

    public void searchBooks(String terms, int page, final ResultCallback callback) {
        String paramTerms = checkParamTerms(terms);
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooks(
                paramTerms,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksInTitle(String title, int page, final ResultCallback callback) {
        String paramTerms = checkParamTerms(title);
        paramTerms = "intitle:" + paramTerms;
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooks(
                paramTerms,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksInAuthor(String author, int page, final ResultCallback callback) {
        String paramTerms = checkParamTerms(author);
        paramTerms = "inauthor:" + paramTerms;
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooks(
                paramTerms,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksInPublisher(String publisher, int page, final ResultCallback callback) {
        String paramTerms = checkParamTerms(publisher);
        paramTerms = "inpublisher:" + paramTerms;
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooks(
                paramTerms,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksPrintType(String terms,
                                     String printType, int page, final ResultCallback callback) {
        if (!printType.matches(KEY_BOOKS) && printType.matches(KEY_MAGAZINES)) {
            Throwable t = new Throwable("orderBy parameter should be 'relevance' or 'newest'");
            callback.onFailure(t);
            return;
        }
        String paramTerms = checkParamTerms(terms);
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooksPrintType(
                paramTerms,
                printType,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksLangRestrict(String terms,
                                        String lang, int page, final ResultCallback callback) {
        String paramTerms = checkParamTerms(terms);
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooksLangRestrict(
                paramTerms,
                lang,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void searchBooksOrderBy(String terms,
                                   String orderBy, int page, final ResultCallback callback) {
        if (!orderBy.matches(KEY_RELEVANCE) && orderBy.matches(KEY_NEWEST)) {
            Throwable t = new Throwable("orderBy parameter should be 'relevance' or 'newest'");
            callback.onFailure(t);
            return;
        }
        String paramTerms = checkParamTerms(terms);
        String paramMaxResults = String.valueOf(maxResults);
        String paramStartIndex = String.valueOf(page * maxResults);
        Call<Result> call = booksApiService.searchBooksOrderBy(
                paramTerms,
                orderBy,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void getBook(String title, final ItemCallback callback) {
        String paramTitle = checkParamTerms(title);
        String paramMaxResults = String.valueOf(1);
        String paramStartIndex = String.valueOf(0);
        Call<Result> call = booksApiService.searchBooks(
                paramTitle,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    public void getBookForIsbn(String isbn, final ItemCallback callback) {
        String paramIsbn = checkParamTerms(isbn);
        paramIsbn = "isbn:" + paramIsbn;
        String paramMaxResults = String.valueOf(1);
        String paramStartIndex = String.valueOf(0);
        Call<Result> call = booksApiService.searchBooks(
                paramIsbn,
                paramMaxResults,
                paramStartIndex,
                apiKey);
        callback(callback, call);
    }

    private void callback(final ResultCallback callback, Call<Result> call) {
        call.enqueue(new retrofit.Callback<Result>() {
            @Override
            public void onResponse(Response<Result> response, Retrofit retrofit) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                callback.onFailure(t);
            }
        });
    }

    private void callback(final ItemCallback callback, Call<Result> call) {
        call.enqueue(new retrofit.Callback<Result>() {
            @Override
            public void onResponse(Response<Result> response, Retrofit retrofit) {
                Item item = response.body().getItems().get(0);
                if (item == null) {
                    callback.onFailure(new Throwable("Item not founded"));
                } else {
                    callback.onSuccess(item);
                }
            }

            @Override
            public void onFailure(Throwable t) {
                callback.onFailure(t);
            }
        });
    }

    private String checkParamTerms(String terms) {
        return terms;
    }
}
