package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import com.ofemmy.librarymanager.models.Role;


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

  public static User createMember(String firstName, String lastName, String email,
      Address address) {
    return new User(firstName, lastName, email, address, Role.MEMBER);
  }

  public static User createLibrarian(String firstName, String lastName, String email,
      Address address) {
    return new User(firstName, lastName, email, address, Role.LIBRARIAN);
  }

  @Override
  public String toString() {
    return "User{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email=" + email +
        ", address=" + address +
        ", role=" + role +
        '}';
  }
}
