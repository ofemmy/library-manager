package com.ofemmy.librarymanager.services.book;

import com.ofemmy.librarymanager.models.book.Book;
import com.ofemmy.librarymanager.repositories.book.BookRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> getAllBooks() {
    return (List) this.bookRepository.findAll();
  }
}
