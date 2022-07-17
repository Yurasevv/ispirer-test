package com.ispirer.ispirerTest.сontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

    @GetMapping("/main")
    public String mainController() { ;
        return "main";
    }

    @PostMapping("/main")
    public String showMessage(
            @RequestParam("text") String message,
            Model model
    ){
        model.addAttribute("message", message);
        return "main";
    }

}
