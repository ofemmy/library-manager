package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private Address address;


  protected UserProfile() {
  }

  public UserProfile(String firstName, String lastName,
      Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }
}
