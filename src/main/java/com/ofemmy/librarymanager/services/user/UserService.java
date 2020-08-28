package com.ofemmy.librarymanager.services.user;

import com.ofemmy.librarymanager.models.user.UserAccount;
import com.ofemmy.librarymanager.models.user.UserDto;
import com.ofemmy.librarymanager.repositories.user.UserAccountRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserAccountRepository userAccountRepository;
  private PasswordEncoder passwordEncoder;

  public UserService(
      UserAccountRepository userAccountRepository,
      PasswordEncoder passwordEncoder) {
    this.userAccountRepository = userAccountRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public void saveUser(UserDto userDto) {
    UserAccount userAccount = UserAccount
        .createMember(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
            LocalDate.now(), true);
    this.userAccountRepository.save(userAccount);
  }

  public List<UserAccount> getAllUsers() {
    return (List) this.userAccountRepository.findAll();
  }
}
