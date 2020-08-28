package com.ofemmy.librarymanager.controllers;

import com.ofemmy.librarymanager.models.user.UserDto;
import com.ofemmy.librarymanager.services.user.UserService;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

  private UserService userService;

  public AuthController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String login() {
    return "users/loginForm";
  }

  @GetMapping("/register")
  private String getRegistrationForm(Model model) {
    this.userService.saveUser();
    model.addAttribute("user", new UserDto());
    return "users/registerMemberForm";
  }

  @PostMapping("/register")
  private String register(@ModelAttribute("user") @Valid UserDto userDto,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "users/registerMemberForm";
    }
    return "demo";
  }
}
