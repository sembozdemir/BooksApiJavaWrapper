package com.sembozdemir.booksapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.sembozdemir.booksapi.library.BooksApi;
import com.sembozdemir.booksapi.library.ResultCallback;
import com.sembozdemir.booksapi.library.models.Item;
import com.sembozdemir.booksapi.library.models.Result;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String GOOGLE_API_KEY = "your_api_key";
    private EditText editText;
    private ImageButton searchButton;
    private ListView listView;
    private BookListAdapter bookListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        ArrayList<Item> bookList = new ArrayList<>();
        bookListAdapter = new BookListAdapter(this,
                R.layout.list_item_books, bookList);
        listView.setAdapter(bookListAdapter);
    }

    private void initViews() {
        editText = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);
        searchButton = (ImageButton) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchBooks();
            }
        });
    }

    private void searchBooks() {
        BooksApi booksApi = BooksApi.create(GOOGLE_API_KEY);
        booksApi.searchBooks(editText.getText().toString(),
                0,
                new ResultCallback() {
                    @Override
                    public void onSuccess(Result result) {
                        bookListAdapter.clear();
                        bookListAdapter.addAll(result.getItems());
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Log.e(TAG, t.getMessage());
                    }
                });
    }
}
