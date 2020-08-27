package com.ofemmy.librarymanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

  @RequestMapping("/")
  public String indexPage() {
    return "index";
  }

  @RequestMapping("/sign-up")
  public String register() {
    return "users/registerMemberForm";
  }

  @GetMapping("/login")
  public String login() {
    return "users/loginForm";
  }
}
