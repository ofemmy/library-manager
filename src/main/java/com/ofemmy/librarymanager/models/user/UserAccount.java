package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Role;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String email;
  private String password;
  private LocalDate dateJoined;
  private Boolean isEnabled;
  @Enumerated(value = EnumType.STRING)
  private Role role;

  private UserAccount(String email, String password, LocalDate dateJoined, Boolean isEnabled,
      Role role) {
    this.email = email;
    this.password = password;
    this.dateJoined = dateJoined;
    this.isEnabled = isEnabled;
    this.role = role;
  }

  protected UserAccount() {

  }

  public static UserAccount createMember(String email, String password, LocalDate dateJoined,
      Boolean isEnabled) {
    return new UserAccount(email, password, dateJoined, isEnabled, Role.MEMBER);
  }

  public static UserAccount createAdmin(String email, String password, LocalDate dateJoined,
      Boolean isEnabled) {
    return new UserAccount(email, password, dateJoined, isEnabled, Role.ADMIN);
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
}
