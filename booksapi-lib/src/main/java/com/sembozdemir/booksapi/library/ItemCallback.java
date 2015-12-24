package com.sembozdemir.booksapi.library;

import com.sembozdemir.booksapi.library.models.Item;
import com.sembozdemir.booksapi.library.models.Result;

/**
 * Created by semih on 24.12.2015.
 */
public interface ItemCallback {
    void onSuccess(Item item);
    void onFailure(Throwable t);
}
