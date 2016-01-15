# BooksApiJavaWrapper
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-BooksApiJavaWrapper-green.svg?style=true)](https://android-arsenal.com/details/1/3018)

It is a java wrapper for querying books information on Google Books Api.
This library is using [RetroFit](http://square.github.io/retrofit/) and works asynchronously. You do not have to think about network connections or json parsing etc.

I developed it in Android. But, you can also use it in any java project.


## How to add
BooksApiJavaWrapper is published with [JitPack.io](https://jitpack.io).
To add this library to your project, add these lines to your build.gradle

```
repositories {
  maven { url "https://jitpack.io" }
}

dependencies {
  // ... other dependencies
  compile 'com.github.sembozdemir:BooksApiJavaWrapper:1.0.0'
}
```
To add in other build systems (like maven), see [here](https://jitpack.io/#sembozdemir/BooksApiJavaWrapper/1.0.0).

## How to use

#### First of all, create a BooksApi instance.
```
BooksApi booksApi = BooksApi.create(GOOGLE_API_KEY);
```
You should get an API KEY for Google Books Api. Please see [this page](https://developers.google.com/books/docs/v1/using#auth) if you need help about API KEY.

#### Get a book that is most relevant of your search
```
booksApi.getBook(terms, new ItemCallback() {
            @Override
            public void onSuccess(Item item) {
                // it is the title of the item
                // item.getVolumeInfo().getTitle();
            }

            @Override
            public void onFailure(Throwable throwable) {
                // handle exception
            }
        });
```

#### Get a book by ISBN number
```
booksApi.getBookForIsbn(isbnNumber, new ItemCallback() {
            @Override
            public void onSuccess(Item item) {
                // it is the title of the item
                // item.getVolumeInfo().getTitle();
            }

            @Override
            public void onFailure(Throwable throwable) {
                // handle exception
            }
        });
```

#### Get a book by [volume id](https://developers.google.com/books/docs/v1/using#ids)
```
booksApi.getBookById(volumeId, new ItemCallback() {
            @Override
            public void onSuccess(Item item) {
                // it is the title of the item
                // item.getVolumeInfo().getTitle();
            }

            @Override
            public void onFailure(Throwable throwable) {
                // handle exception
            }
        });
```

#### Searching books
```
booksApi.searchBooks(terms, // what you want to search
                0, // which page you want to get
                new ResultCallback() {
                    @Override
                    public void onSuccess(Result result) {
                        // it is the title of the first item of results
                        // result.getItems().get(0).getVolumeInfo().getTitle()
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        // handle exception somehow
                    }
                });
```

- BooksApiJavaWrapper make pagination easier. If you want to get the first page of results, give parameter as "0". 
Also, max result number in one page is default 10. You can change it if you want. (It can be max 40)
```
booksApi.setMaxResults(20);
```

**There are more search methods. You can use them if you want. Usage is the same.**

## Contribution

You are welcome to pull request.

## Licence
```
The MIT License (MIT)

Copyright (c) 2015 Semih Bozdemir

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```


