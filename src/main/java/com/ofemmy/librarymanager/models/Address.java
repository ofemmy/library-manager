package com.ofemmy.librarymanager.models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

  private String streetAddress;
  private String city;
  private String state;
  private String zipcode;
  private String country;

  private Address(String streetAddress, String city, String state, String zipcode,
      String country) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.country = country;
  }

  protected Address() {

  }

  public static Address of(String streetAddress, String city, String state, String zipcode,
      String country) {
    return new Address(streetAddress, city, state, zipcode, country);
  }

  @Override
  public String toString() {
    return "Address{" +
        "streetAddress='" + streetAddress + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", zipcode='" + zipcode + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
