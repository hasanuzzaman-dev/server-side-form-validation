package com.hasan.serversidevalidation.controller;

import com.hasan.serversidevalidation.models.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model){
        model.addAttribute("loginData",new LoginData());
        return "form";
    }
}
