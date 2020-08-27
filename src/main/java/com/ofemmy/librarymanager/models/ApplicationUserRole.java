package com.ofemmy.librarymanager.models;

import static com.ofemmy.librarymanager.models.ApplicationUserPermission.BOOK_READ;
import static com.ofemmy.librarymanager.models.ApplicationUserPermission.BOOK_WRITE;
import static com.ofemmy.librarymanager.models.ApplicationUserPermission.MEMBER_READ;
import static com.ofemmy.librarymanager.models.ApplicationUserPermission.MEMBER_WRITE;

import com.google.common.collect.Sets;
import java.util.Set;

public enum ApplicationUserRole {
  MEMBER(Sets.newHashSet(MEMBER_READ, BOOK_READ)),
  LIBRARIAN(Sets.newHashSet(MEMBER_READ, MEMBER_WRITE, BOOK_READ, BOOK_WRITE));
  private Set<ApplicationUserPermission> permissions;

  ApplicationUserRole(
      Set<ApplicationUserPermission> permissions) {
    this.permissions = permissions;
  }
}
