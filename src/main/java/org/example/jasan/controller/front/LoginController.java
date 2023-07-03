package org.example.jasan.controller.front;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage(Model model){
        model.addAttribute("isLogined","No");
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam(value = "login") String login,
                        @RequestParam(value = "password") String password){
        log.info("[LoginController POST REQUEST] login: {};password: {}",login, password);
        if (login.equals("test") && password.equals("test")){
            return "redirect:/users";
        }else {
            model.addAttribute("isLogined","Wrong password or login");
        }
        return "login";
    }
}
