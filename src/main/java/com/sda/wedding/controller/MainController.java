package com.sda.wedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    private static final String HELLO_MESSAGE = "welcomeMsg";

    @GetMapping("/welcome")
    public String showWelcomeMsg(final ModelMap modelMap) {
        modelMap.addAttribute(HELLO_MESSAGE, "Welcome to you wedding planner");
        return "index";
    }
}
