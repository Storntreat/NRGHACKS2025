package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AnchorController {

    @GetMapping("/")
    String index(Model model){
        return "home";
    }
}