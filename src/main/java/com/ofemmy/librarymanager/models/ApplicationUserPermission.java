package com.ofemmy.librarymanager.models;

public enum ApplicationUserPermission {

  BOOK_READ("book:read"), BOOK_WRITE("book:write"), MEMBER_READ("member:read"), MEMBER_WRITE(
      "member:write");
  private final String permission;

  ApplicationUserPermission(String permission) {
    this.permission = permission;
  }

  public String getPermission() {
    return permission;
  }
}
