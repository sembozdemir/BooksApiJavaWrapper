package com.sembozdemir.booksapi.library;

import com.sembozdemir.booksapi.library.models.Result;

/**
 * Created by semih on 24.12.2015.
 */
public interface ResultCallback {
    void onSuccess(Result result);
    void onFailure(Throwable t);
}
