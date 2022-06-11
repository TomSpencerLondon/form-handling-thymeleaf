package com.example.formhandlingthymeleaf.user;

import com.example.formhandlingthymeleaf.user.User;
import com.example.formhandlingthymeleaf.user.UserCreationParameters;
import java.util.List;

public interface UserService {
  User createUser(UserCreationParameters parameters);

  List<User> getUsers();
}
