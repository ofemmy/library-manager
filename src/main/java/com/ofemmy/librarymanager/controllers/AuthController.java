package com.ofemmy.librarymanager.controllers;

import com.ofemmy.librarymanager.models.user.UserAccount;
import com.ofemmy.librarymanager.models.user.UserDto;
import com.ofemmy.librarymanager.services.user.UserService;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
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
  public String getRegistrationForm(Model model) {
    model.addAttribute("user", new UserDto());
    return "users/registerMemberForm";
  }

  @PostMapping("/register")
  public String register(@ModelAttribute("user") @Valid UserDto userDto,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "users/registerMemberForm";
    }
    UserAccount user = this.userService.saveUser(userDto);
    loginAfterRegistration(user);
    return "index";
  }

  private void loginAfterRegistration(UserAccount user) {
    Set<GrantedAuthority> authorities = Set.of(new SimpleGrantedAuthority(user.getRole().name()));
    Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(),
        user.getPassword(), authorities);
    SecurityContextHolder.getContext().setAuthentication(authentication);
  }
}
