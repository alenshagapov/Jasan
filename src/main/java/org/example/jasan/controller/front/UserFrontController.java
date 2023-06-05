package org.example.jasan.controller.front;

import org.example.jasan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserFrontController {

    private UserService userService;

    @Autowired
    private void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showUsersPage(Model model){
        model.addAttribute("users",userService.getAll());
        return "users";
    }

}
