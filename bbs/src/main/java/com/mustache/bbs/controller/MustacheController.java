package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

//    @GetMapping(value = "/hi")
//    public String mustacheCon(Model model) {
//        model.addAttribute("username", "ju");
//        return "greetings";
//    }

    @GetMapping("/hi/{id}")
    public String mustacheCon(Model model, @PathVariable String id){
        model.addAttribute("username", "ju");
        model.addAttribute("userId", id);
        return "greetings";
    }
}
