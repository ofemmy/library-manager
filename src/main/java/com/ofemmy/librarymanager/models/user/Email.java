package com.ofemmy.librarymanager.models.user;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.Embeddable;

@Embeddable
class Email {

  private String email;
  private static String regex;
  private static Pattern pattern;

  static {
    regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    pattern = Pattern.compile(regex);
  }

  private Email(String email) {
    Matcher mt = pattern.matcher(email);
    if (!mt.matches()) {
      throw new IllegalArgumentException("Invalid email");
    }
    this.email = email;
  }

  protected Email() {

  }

  public static Email of(String email) {
    checkNotNull(email);
    return new Email(email);
  }

  @Override
  public String toString() {
    return "Email{" +
        "email='" + email + '\'' +
        '}';
  }
}
