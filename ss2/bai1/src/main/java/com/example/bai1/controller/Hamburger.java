package com.example.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hamburger {
@GetMapping("save")
    public String show(Model model ){
    return "type";
}
@PostMapping("save")
    public String create(@RequestParam("condiment")String[] condiment,Model model  ){

   model.addAttribute("result",condiment);
    return "type";
}
}
