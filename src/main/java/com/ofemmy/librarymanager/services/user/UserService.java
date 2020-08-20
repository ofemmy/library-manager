package com.ofemmy.librarymanager.services.user;

import com.ofemmy.librarymanager.repositories.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void saveUser() {

  }
}
