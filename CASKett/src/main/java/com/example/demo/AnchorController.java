package com.example.demo;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping("/save-text")
    public Map<String, String> saveText(@RequestBody Map<String, String> request) {
        String receivedText = request.get("text");
        System.out.println("Received text: " + receivedText); // Log to console
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("received", receivedText);
        return response;
    }

    
}