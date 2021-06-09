package com.firstapp.crudoperation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.firstapp.crudoperation.models.User;
import com.firstapp.crudoperation.services.UserService;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    // get all the Users.
    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    // get UsersById.
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return this.userService.getUser(Integer.parseInt(id));
    }

    // add new User
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    // update User by userId
    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id) {
        return this.userService.deleteUser(id);
    }
}
