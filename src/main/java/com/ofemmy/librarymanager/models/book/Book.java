package com.ofemmy.librarymanager.models.book;

import com.ofemmy.librarymanager.models.BookFormat;


public class Book {

  private final String ISBN;
  private final String title;
  private final String publisher;
  private final int numOfPages;
  private final String language;
  private final int stockQty;
  private final BookFormat bookFormat;

  private Book(String ISBN, String title, String publisher, int numOfPages, String language,
      int stockQty, BookFormat bookFormat) {
    this.ISBN = ISBN;
    this.title = title;
    this.publisher = publisher;
    this.numOfPages = numOfPages;
    this.language = language;
    this.stockQty = stockQty;
    this.bookFormat = bookFormat;
  }


  public static Book createBook(String ISBN, String title, String publisher, int numOfPages,
      String language,
      int stockQty, BookFormat bookFormat) {
    return new Book(ISBN, title, publisher, numOfPages, language, stockQty, bookFormat);
  }

  @Override
  public String toString() {
    return "Book{" +
        "ISBN='" + ISBN + '\'' +
        ", title='" + title + '\'' +
        ", publisher='" + publisher + '\'' +
        ", numOfPages=" + numOfPages +
        ", language='" + language + '\'' +
        ", stockQty=" + stockQty +
        ", bookFormat=" + bookFormat +
        '}';
  }
}
