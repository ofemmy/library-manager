package com.ofemmy.librarymanager.controllers.user;

import com.ofemmy.librarymanager.services.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/create-users")
  private String createUsers(Model model) {
    this.userService.saveUser();
    model.addAttribute("message", "New users added");
    return "demo";
  }
}
