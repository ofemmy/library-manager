package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import com.ofemmy.librarymanager.models.Role;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  @Embedded
  private Email email;
  @Embedded
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

  protected User() {

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
