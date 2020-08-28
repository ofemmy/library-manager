package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.annotations.PasswordMatches;
import com.ofemmy.librarymanager.models.annotations.ValidEmail;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserDto {

  @NotNull
  @NotEmpty(message = "Email cannot be empty")
  @ValidEmail
  private String email;
  @NotNull
  @NotEmpty(message = "Password cannot be empty")
  private String password;
  private String matchingPassword;

  public UserDto() {
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMatchingPassword() {
    return matchingPassword;
  }

  public void setMatchingPassword(String matchingPassword) {
    this.matchingPassword = matchingPassword;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", matchingPassword='" + matchingPassword + '\'' +
        '}';
  }
}
