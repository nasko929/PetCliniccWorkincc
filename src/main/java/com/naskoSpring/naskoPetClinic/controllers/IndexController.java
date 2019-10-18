package com.naskoSpring.naskoPetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(Model model) {
        System.out.println("Hlell");
        model.addAttribute("helloWorldNotice", "Hello Guys!");
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(Model model) {

        return "notimplemented";
    }
}
