package com.ofemmy.librarymanager.repositories.user;

import com.ofemmy.librarymanager.models.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
