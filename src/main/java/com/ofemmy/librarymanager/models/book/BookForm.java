package com.ofemmy.librarymanager.models.book;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class BookForm {

  private String ISBN;
  @NotEmpty(message = "Title is required")
  @NotNull
  private String title;
  @NotEmpty
  @NotNull
  private String author;
  private String publisher;
  private int numOfPages;
  private String language;
  private int stockQty;
  private LocalDate year;

  private BookForm(String ISBN, String title, String author, String publisher, int numOfPages,
      String language, int stockQty, LocalDate year) {
    this.ISBN = ISBN;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.numOfPages = numOfPages;
    this.language = language;
    this.stockQty = stockQty;
    this.year = year;
  }

  public BookForm() {
  }

  public static BookForm createBookForm(String ISBN, String title, String author, String publisher,
      int numOfPages,
      String language, int stockQty, LocalDate year) {
    return new BookForm(ISBN, title, author, publisher, numOfPages, language, stockQty, year);
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getStockQty() {
    return stockQty;
  }

  public void setStockQty(int stockQty) {
    this.stockQty = stockQty;
  }

  public LocalDate getYear() {
    return year;
  }

  public void setYear(LocalDate year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "BookForm{" +
        "ISBN='" + ISBN + '\'' +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", publisher='" + publisher + '\'' +
        ", numOfPages=" + numOfPages +
        ", language='" + language + '\'' +
        ", stockQty=" + stockQty +
        ", year=" + year +
        '}';
  }
}
