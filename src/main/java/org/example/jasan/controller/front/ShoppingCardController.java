package org.example.jasan.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShoppingCardController {

    @GetMapping("/shoppingCard/{userId}")
    public String shoppingCardPage(Model model, @PathVariable int userId){
        model.addAttribute("userId",userId);
        return "shoppingCard";
    }

}
