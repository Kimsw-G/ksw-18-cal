package com.example.ksw18cal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String hello(Model model){

        int month = 7;
        model.addAttribute("blank", mainService.getBlank(month));
        model.addAttribute("end", mainService.getEndOfDay(month));
        model.addAttribute("month",month);

        return "hello2";
    }
}
