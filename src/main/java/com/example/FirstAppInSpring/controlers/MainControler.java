package com.example.FirstAppInSpring.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControler {

    @GetMapping("/")
   // @ResponseBody
    public String index (Model model){
        model.addAttribute("name", "Jan");
        model.addAttribute("surname","Kowalski");
        return "index";
    }
}
