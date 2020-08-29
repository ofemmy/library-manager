package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Role;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private LocalDate dateJoined;
  private Boolean isEnabled;
  @Enumerated(value = EnumType.STRING)
  private Role role;

  private UserAccount(String firstName, String lastName, String email, String password,
      LocalDate dateJoined, Boolean isEnabled,
      Role role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.dateJoined = dateJoined;
    this.isEnabled = isEnabled;
    this.role = role;
  }

  protected UserAccount() {

  }

  public static UserAccount createMember(String firstName, String lastName, String email,
      String password, LocalDate dateJoined,
      Boolean isEnabled) {
    return new UserAccount(firstName, lastName, email, password, dateJoined, isEnabled,
        Role.MEMBER);
  }

  public static UserAccount createAdmin(String firstName, String lastName, String email,
      String password, LocalDate dateJoined,
      Boolean isEnabled) {
    return new UserAccount(firstName, lastName, email, password, dateJoined, isEnabled, Role.ADMIN);
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LocalDate getDateJoined() {
    return dateJoined;
  }

  public Boolean getEnabled() {
    return isEnabled;
  }

  public Role getRole() {
    return role;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
