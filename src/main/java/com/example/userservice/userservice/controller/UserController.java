package com.example.userservice.userservice.controller;


import com.example.userservice.userservice.ResponseWIthDepartmetn.ResponseTemplate;
import com.example.userservice.userservice.entity.User;
import com.example.userservice.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;



    @Autowired
    UserController(UserService userService){
        this.userService = userService;

    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDeapartmetn(userId);
    }

}
