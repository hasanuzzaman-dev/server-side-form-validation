package com.hasan.serversidevalidation.controller;

import com.hasan.serversidevalidation.models.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model) {
        System.out.println("Open form");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    // handler for processing form
    @PostMapping("/process")
    public String processForm(@ModelAttribute("loginData") @Valid LoginData loginData, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println(result);
        }

        System.out.println(loginData);

        return "success";

    }
}
