package com.ispirer.ispirerTest.сontroller;

import com.ispirer.ispirerTest.domain.Counter;
import com.ispirer.ispirerTest.domain.ListUsr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListController {
    ListUsr listUsr = new ListUsr();

    @GetMapping("/list")
    public String listController(Model model) {
        model.addAttribute("isChanged", listUsr.capacityChanged());
        model.addAttribute("objList", listUsr);
        return "list";
    }

    @PostMapping("/list")
    public String addObject(Model model){
        Counter counter = new Counter();
        listUsr.add(counter);
        model.addAttribute("objList", listUsr);
        model.addAttribute("isChanged", listUsr.capacityChanged());

        return "list";
    }
}
