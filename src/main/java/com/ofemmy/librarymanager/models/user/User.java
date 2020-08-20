package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import com.ofemmy.librarymanager.models.Role;
import lombok.ToString;

@ToString
public class User {

  private String firstName;
  private String lastName;
  private Email email;
  private Address address;
  private Role role;

  private User(String firstName, String lastName, String email,
      Address address, Role role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = Email.of(email);
    this.address = address;
    this.role = role;
  }

  public static User createUser(String firstName, String lastName, String email,
      Address address, Role role) {
    return new User(firstName, lastName, email, address, role);
  }
}
