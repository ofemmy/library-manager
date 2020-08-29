package com.ofemmy.librarymanager.services.user;

import com.ofemmy.librarymanager.models.exceptions.UserAlreadyExistException;
import com.ofemmy.librarymanager.models.user.UserAccount;
import com.ofemmy.librarymanager.models.user.UserDto;
import com.ofemmy.librarymanager.repositories.user.UserAccountRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

  @Transactional
  public UserAccount registerNewUserAccount(UserDto userDto) throws UserAlreadyExistException {
    UserAccount userAccount = UserAccount
        .createMember(userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(),
            passwordEncoder.encode(userDto.getPassword()),
            LocalDate.now(), true);
    if (emailExitAlready(userAccount.getEmail())) {
      throw new UserAlreadyExistException("Account with email/username exists already");
    }
    this.userAccountRepository.save(userAccount);
    return userAccount;
  }

  public List<UserAccount> getAllUsers() {
    return (List) this.userAccountRepository.findAll();
  }

  private boolean emailExitAlready(String email) {
    Optional<UserAccount> user = userAccountRepository
        .findUserByEmailIgnoreCase(email);
    return user.isPresent();
  }


}
