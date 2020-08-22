package com.ofemmy.librarymanager.controllers.book;

import com.ofemmy.librarymanager.models.book.Book;
import com.ofemmy.librarymanager.services.book.BookService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

  private BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @RequestMapping("")
  public String showAllBooks(Model model) {
    List<Book> books = this.bookService.getAllBooks();
    model.addAttribute("books", books);
    return "books/index";
  }
}
