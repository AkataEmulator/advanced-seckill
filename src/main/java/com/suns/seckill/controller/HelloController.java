package com.suns.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "suns");
        return "hello";
    }
}
