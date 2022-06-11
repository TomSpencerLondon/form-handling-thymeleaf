package com.example.formhandlingthymeleaf.user.web;

import com.example.formhandlingthymeleaf.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController {

  private final UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping("/create")
  public String showCreateUserForm(Model model) {
    model.addAttribute("formData", new CreateUserFormData());

    return "users/create";
  }

}
