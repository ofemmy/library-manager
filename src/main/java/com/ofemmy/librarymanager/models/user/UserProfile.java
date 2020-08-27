package com.ofemmy.librarymanager.models.user;

import com.ofemmy.librarymanager.models.Address;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private Address address;
  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userProfile")
  private UserAccount user;

  protected UserProfile() {
  }

  public UserProfile(String firstName, String lastName,
      Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }
}
