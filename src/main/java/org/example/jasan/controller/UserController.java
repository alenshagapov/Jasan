package org.example.jasan.controller;

import org.example.jasan.model.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/auth")
    public String auth(@RequestBody UserDto userData){
        System.out.println("User login: " + userData.getUserNameSecond());
        System.out.println("User password: " + userData.getPassword());
        return userData.getUserNameSecond() + "123";
    }
}
