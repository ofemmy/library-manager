package com.ofemmy.librarymanager.controllers.user;

import com.ofemmy.librarymanager.models.user.UserAccount;
import com.ofemmy.librarymanager.services.user.UserService;
import java.util.List;
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


  @RequestMapping("")
  public String showAllUsers(Model model) {
    List<UserAccount> allUsers = this.userService.getAllUsers();
    model.addAttribute("users", allUsers);
    return "users/index";
  }

  @RequestMapping("/create-users")
  private String createUsers(Model model) {
    this.userService.saveUser();
    model.addAttribute("message", "New users added");
    return "demo";
  }
}
