package com.ofemmy.librarymanager.models.book;

import com.ofemmy.librarymanager.models.user.UserAccount;
import java.math.BigDecimal;
import java.time.LocalDate;

public class BookItem {

  private final LocalDate borrowedDate;
  private final LocalDate dueDate;
  private final BigDecimal fine;
  private final Book book;
  private final UserAccount borrower;

  private BookItem(LocalDate borrowedDate, LocalDate dueDate, BigDecimal fine,
      Book book, UserAccount borrower) {
    this.borrowedDate = borrowedDate;
    this.dueDate = dueDate;
    this.fine = fine;
    this.book = book;
    this.borrower = borrower;
  }

  public static BookItem createBookItem(LocalDate borrowedDate, LocalDate dueDate, BigDecimal fine,
      Book book, UserAccount borrower) {
    return new BookItem(borrowedDate, dueDate, fine, book, borrower);
  }
}
