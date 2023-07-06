package com.example.practice3.spring_exception.controller;


import com.example.practice3.spring_exception.dto.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@Validated
public class ApiController {

    @GetMapping("/user")
    public User user(
            @RequestParam String name,
            @RequestParam int age) {

        User user = null;
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {
        System.out.println(user);
        return ResponseEntity.ok(user);
    }
}