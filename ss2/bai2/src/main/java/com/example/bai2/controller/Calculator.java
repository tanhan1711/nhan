package com.example.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Calculator {
    @GetMapping("/caculator")
    private String show() {
        return "caculator";
    }

    @PostMapping("/caculator")
    private String exchange(Model model,
                            @RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("dau") String dau,
                            RedirectAttributes redirectAttributes) {
        int result =0;
        switch (dau) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        redirectAttributes.addFlashAttribute("result", result);
        redirectAttributes.addFlashAttribute("num1", num1);
        redirectAttributes.addFlashAttribute("num2", num2);
        return "redirect:/caculator";
    }
}
