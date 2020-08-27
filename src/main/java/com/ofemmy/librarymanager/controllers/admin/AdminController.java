package com.ofemmy.librarymanager.controllers.admin;

import com.ofemmy.librarymanager.models.book.BookForm;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


  @GetMapping("/create-book")
  public String addBookForm(Model model) {
    model.addAttribute("bookForm", new BookForm());
    return "books/addBookForm";
  }

  @PostMapping("/save-book")
  public String saveBook(@ModelAttribute @Valid BookForm bookForm,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      bindingResult.getAllErrors().forEach(System.out::println);
      return "books/addBookForm";
    } else {
      /*Book newBook = Book.createBook("1234-22566-44224", bookForm.getTitle(), bookForm.getAuthor(),
          bookForm.getPublisher(), bookForm.getNumOfPages(), bookForm.getLanguage(),
          bookForm.getStockQty(), bookForm.getYear());
      System.out.println(newBook);*/
      System.out.println("Great job");
      System.out.println(bookForm);
      return "books/index";
    }

  }
}
