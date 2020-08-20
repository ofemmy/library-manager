package com.ofemmy.librarymanager;

import com.ofemmy.librarymanager.models.Address;
import com.ofemmy.librarymanager.models.Role;
import com.ofemmy.librarymanager.models.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagerApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(LibraryManagerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Address a = Address.of("s1", "city", "state", "13469", "London");
    User u = User.createUser("Ori", "Johnson",
        "olabisi@gmail.com", a, Role.LIBRARIAN);
    System.out.println(a);
    System.out.println("==================");
    System.out.println(u);
  }
}
