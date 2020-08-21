package com.ofemmy.librarymanager.services.user;

import com.ofemmy.librarymanager.models.user.User;
import com.ofemmy.librarymanager.repositories.user.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void saveUser() {

  }

  public List<User> getAllUsers() {
    return (List) this.userRepository.findAll();
  }
}
