package org.example.jasan.controller;


import org.example.jasan.model.Users;
import org.example.jasan.model.dto.UserDto;
import org.example.jasan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/user")
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    private void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/auth")
    public String auth(@RequestBody UserDto userData){
        System.out.println("User login: " + userData.getUserNameSecond());
        System.out.println("User password: " + userData.getPassword());
        return userData.getUserNameSecond() + "123";
    }

    @GetMapping("/getAll")
    public ArrayList<Users> getAll(){
        return userService.getAll();
    }

}
