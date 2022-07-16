package com.ispirer.ispirerTest.сontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class MainController implements WebMvcConfigurer {

    @GetMapping("/main")
    public String mainController(){
        return "main";
    }

}
