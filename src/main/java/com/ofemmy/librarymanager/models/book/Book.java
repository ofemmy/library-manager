package com.ofemmy.librarymanager.models.book;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String ISBN;
  private String title;
  private String author;
  private String publisher;
  @Column(name = "pages")
  private int numOfPages;
  private String language;
  private int stockQty;
  private LocalDate year;

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

  protected Book() {

  }


  public static Book createBook(String ISBN, String title, String author, String publisher,
      int numOfPages,
      String language,
      int stockQty, LocalDate year) {
    return new Book(ISBN, title, author, publisher, numOfPages, language, stockQty, year);
  }

  public String getISBN() {
    return ISBN;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public String getLanguage() {
    return language;
  }

  public int getStockQty() {
    return stockQty;
  }

  public LocalDate getYear() {
    return year;
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
