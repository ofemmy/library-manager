package com.ofemmy.librarymanager.repositories.user;

import com.ofemmy.librarymanager.models.user.UserAccount;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

  Optional<UserAccount> findUserByEmailIgnoreCase(String email);
}
