package com.ofemmy.librarymanager.models.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

  private String userName;
  private String password;
  private boolean isActive;
  private List<GrantedAuthority> authorities = new ArrayList<>();

  public MyUserDetails(UserAccount user) {
    this.userName = user.getEmail();
    this.password = user.getPassword();
    this.isActive = user.getEnabled();
    this.authorities.add(new SimpleGrantedAuthority(user.getRole().name()));
  }

 /* public MyUserDetails(String userName) {
    this.userName = userName;
    this.password = "foo";
  }*/

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.authorities;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public String getUsername() {
    return this.userName;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return this.isActive;
  }
}
