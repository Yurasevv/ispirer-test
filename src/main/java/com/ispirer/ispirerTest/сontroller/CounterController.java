package com.ispirer.ispirerTest.сontroller;

import com.ispirer.ispirerTest.domain.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CounterController {
    @GetMapping("/counter")
    public String counterController(Model model) {
        model.addAttribute("count", Counter.getCount());
        return "counter";
    }

    @PostMapping("/counter")
    public String addEntity(Model model){
        Counter counter = new Counter();
        model.addAttribute("count", Counter.getCount());

        return "counter";
    }
}
