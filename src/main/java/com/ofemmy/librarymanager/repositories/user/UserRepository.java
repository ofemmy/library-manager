package com.ofemmy.librarymanager.repositories.user;

import com.ofemmy.librarymanager.models.user.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findUserByEmailIgnoreCase(String email);
}
