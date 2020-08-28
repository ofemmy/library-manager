package com.ofemmy.librarymanager.models;

import com.ofemmy.librarymanager.models.annotations.PasswordMatches;
import com.ofemmy.librarymanager.models.user.UserDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

  @Override
  public void initialize(PasswordMatches constraintAnnotation) {

  }

  @Override
  public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
    UserDto user = (UserDto) o;
    return user.getPassword().equals(user.getMatchingPassword());
  }
}
