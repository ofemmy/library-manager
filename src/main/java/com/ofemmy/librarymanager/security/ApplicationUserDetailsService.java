package com.ofemmy.librarymanager.security;

import com.ofemmy.librarymanager.models.user.MyUserDetails;
import com.ofemmy.librarymanager.models.user.User;
import com.ofemmy.librarymanager.repositories.user.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    Optional<User> user = userRepository.findUserByEmailIgnoreCase(s);
    user.orElseThrow(() -> new UsernameNotFoundException(s + " not found"));

    MyUserDetails userDetails = user.map(MyUserDetails::new).get();
    userDetails.getAuthorities().forEach(System.out::println);
    return userDetails;
  }
}
