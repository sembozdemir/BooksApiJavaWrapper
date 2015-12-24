package com.sembozdemir.booksapi.library;

import com.sembozdemir.booksapi.library.models.Result;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by semih on 24.12.2015.
 */
public interface BooksApiService {
    @GET("volumes")
    Call<Result> searchBooks(@Query("q") String terms,
                             @Query("maxResults") String maxResults,
                             @Query("startIndex") String startIndex,
                             @Query("key") String apiKey);

    @GET("volumes")
    Call<Result> searchBooksOrderBy(@Query("q") String terms,
                                    @Query("orderBy") String orderBy,
                                    @Query("maxResults") String maxResults,
                                    @Query("startIndex") String startIndex,
                                    @Query("key") String apiKey);

    @GET("volumes")
    Call<Result> searchBooksLangRestrict(@Query("q") String terms,
                                    @Query("langRestrict") String lang,
                                    @Query("maxResults") String maxResults,
                                    @Query("startIndex") String startIndex,
                                    @Query("key") String apiKey);

    @GET("volumes")
    Call<Result> searchBooksPrintType(@Query("q") String terms,
                                         @Query("printType") String printType,
                                         @Query("maxResults") String maxResults,
                                         @Query("startIndex") String startIndex,
                                         @Query("key") String apiKey);

}
