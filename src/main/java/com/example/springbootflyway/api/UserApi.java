package com.example.springbootflyway.api;

import com.example.springbootflyway.entity.User;
import com.example.springbootflyway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {
    private final UserRepository userRepository;

    @Autowired
    public UserApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
