package com.example.bai2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Translate {
    static Map<String, String> map = new HashMap<>();

    static {
        map.put("dog", "cho");
        map.put("cat", "meo");
        map.put("bird", "chim");
    }

    @GetMapping("/translate")
    public String tranlsate() {
        return "input";
    }

    @PostMapping("/translate")
    public String doTranslate(Model model, @RequestParam("eng") String eng) {
        String result = map.get(eng);
        if (result == null) {
            model.addAttribute("vn","ko co");
        } else {
            model.addAttribute("vn",result);
        }
        return "input";
    }
}
