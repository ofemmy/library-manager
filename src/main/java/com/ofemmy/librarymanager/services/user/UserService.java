package com.ofemmy.librarymanager.services.user;

import com.ofemmy.librarymanager.models.user.UserAccount;
import com.ofemmy.librarymanager.repositories.user.UserAccountRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserAccountRepository userAccountRepository;

  public UserService(UserAccountRepository userAccountRepository) {
    this.userAccountRepository = userAccountRepository;
  }

  public void saveUser() {

  }

  public List<UserAccount> getAllUsers() {
    return (List) this.userAccountRepository.findAll();
  }
}
