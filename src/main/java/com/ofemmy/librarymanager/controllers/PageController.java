package com.ofemmy.librarymanager.controllers;

import com.ofemmy.librarymanager.models.book.Book;
import com.ofemmy.librarymanager.services.book.BookService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

  private BookService bookService;

  public PageController(BookService bookService) {
    this.bookService = bookService;
  }

  @RequestMapping("")
  public String indexPage(Model model) {
    List<Book> books = this.bookService.getAllBooks();
    model.addAttribute("books", books);
    return "books/index";
  }
}
