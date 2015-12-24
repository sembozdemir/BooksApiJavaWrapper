package com.sembozdemir.booksapi;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.sembozdemir.booksapi.library.BooksApi;
import com.sembozdemir.booksapi.library.ItemCallback;
import com.sembozdemir.booksapi.library.ResultCallback;
import com.sembozdemir.booksapi.library.models.Item;
import com.sembozdemir.booksapi.library.models.Result;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
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
                BooksApi booksApi = BooksApi.create("AIzaSyBbAvKDohUGuY5czGSxXHN5YzAUGgvb8Hk");
                booksApi.searchBooks(editText.getText().toString(),
                        0,
                        new ResultCallback() {
                            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
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
        });
    }
}
