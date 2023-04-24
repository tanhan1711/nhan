package com.example.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoney {
@GetMapping("/change")
    public String change(){
    return "input";
}
@PostMapping("/change")
    public String dochange(Model model,@RequestParam String usd) {
    int usd1 = Integer.parseInt(usd);
    int vnd = (23000 * usd1);
    model.addAttribute("vnd", vnd);
    return "result";

}
}
