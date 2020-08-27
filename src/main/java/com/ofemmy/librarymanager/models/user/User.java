package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import com.ofemmy.librarymanager.models.Role;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("ALL")

@Table(name = "members")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  @Embedded
  private Address address;
  @Enumerated(value = EnumType.STRING)
  private Role role;

  private User(String firstName, String lastName, String email,
      Address address, Role role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.address = address;
    this.role = role;
  }

  protected User() {

  }

  public static User createMember(String firstName, String lastName, String email,
      Address address) {
    return new User(firstName, lastName, email, address, Role.MEMBER);
  }

  public static User createAdmin(String firstName, String lastName, String email,
      Address address) {
    return new User(firstName, lastName, email, address, Role.ADMIN);
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

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getRole() {
    return role.name();
  }
}
