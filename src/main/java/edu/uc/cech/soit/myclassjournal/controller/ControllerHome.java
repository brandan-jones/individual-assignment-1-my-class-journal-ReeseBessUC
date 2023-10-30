package edu.uc.cech.soit.myclassjournal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHome {

    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

}