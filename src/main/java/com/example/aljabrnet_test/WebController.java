package com.example.aljabrnet_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // Без расширения
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
