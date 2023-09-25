package com.submit.user.management.controller;

import com.submit.user.management.model.User;
import com.submit.user.management.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User user) {
         userService.addUser(user);
         return "user added";
    }

    @GetMapping("getUser/{userId}")
    public User getUser(@PathVariable Integer userId) {
        return userService.findById(userId);

    }

    @GetMapping("getAllUser")
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @PutMapping("updateUserInfo/{userId}/{email}")
    public String updateUserInfo(@PathVariable Integer userId, @PathVariable String email) {
        return  userService.updateEmail(userId,email);
    }

    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
       return userService.deleteById(userId);
    }
}
