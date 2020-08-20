package com.ofemmy.librarymanager.models;

import lombok.ToString;

@ToString
public class Address {

  private final String streetAddress;
  private final String city;
  private final String state;
  private final String zipcode;
  private final String country;

  private Address(String streetAddress, String city, String state, String zipcode,
      String country) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.country = country;
  }

  public static Address of(String streetAddress, String city, String state, String zipcode,
      String country) {
    return new Address(streetAddress, city, state, zipcode, country);
  }
}
