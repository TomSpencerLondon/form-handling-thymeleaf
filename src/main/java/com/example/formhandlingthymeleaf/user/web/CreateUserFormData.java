package com.example.formhandlingthymeleaf.user.web;

import com.example.formhandlingthymeleaf.user.UserCreationParameters;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserFormData {

  @NotNull
  @Size(min = 1, max = 400)
  private String givenName;

  @NotNull
  @Size(min = 1, max = 400)
  private String familyName;

  public UserCreationParameters toParameters() {
    return new UserCreationParameters(givenName, familyName);
  }

  public String getGivenName() {
    return givenName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }
}
