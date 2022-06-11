package com.example.formhandlingthymeleaf.user;

import com.example.formhandlingthymeleaf.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
