package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import lombok.ToString;

@ToString
public class User {

  private String firstName;
  private String lastName;
  private Email email;
  private Address address;

  private User(String firstName, String lastName, String email,
      Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = Email.of(email);
    this.address = address;
  }

  public static User createUser(String firstName, String lastName, String email,
      Address address) {
    return new User(firstName, lastName, email, address);
  }
}
