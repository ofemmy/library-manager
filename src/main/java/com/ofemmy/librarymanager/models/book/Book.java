package com.ofemmy.librarymanager.models.book;

import java.time.LocalDate;


public class Book {

  private final String ISBN;
  private final String title;
  private final String author;
  private final String publisher;
  private final int numOfPages;
  private final String language;
  private final int stockQty;
  private final LocalDate year;

  private Book(String ISBN, String title, String author, String publisher, int numOfPages,
      String language,
      int stockQty, LocalDate year) {
    this.ISBN = ISBN;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.numOfPages = numOfPages;
    this.language = language;
    this.stockQty = stockQty;
    this.year = year;
  }


  public static Book createBook(String ISBN, String title, String author, String publisher,
      int numOfPages,
      String language,
      int stockQty, LocalDate year) {
    return new Book(ISBN, title, author, publisher, numOfPages, language, stockQty, year);
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
        '}';
  }
}
