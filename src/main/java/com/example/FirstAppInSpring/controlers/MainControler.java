package com.example.FirstAppInSpring.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControler {

    @GetMapping("/")
    // @ResponseBody
    public String index(Model model) {
        model.addAttribute("name", "Jan");
        model.addAttribute("surname", "Kowalski");
        return "index";
    }

    @GetMapping("/info/{age}")
    @ResponseBody
    public String info(@PathVariable("age") int someNumber) {
        return someNumber >= 18 ? "Wbijaj do klubu" : "Dobranocka o 19 ";
    }
    @GetMapping("/welcome/{name}/{surname}")
    @ResponseBody
    public String welcome (@PathVariable ("name") String name,
                           @PathVariable ("surname") String surname){
        return name + " " + surname;
    }

}
