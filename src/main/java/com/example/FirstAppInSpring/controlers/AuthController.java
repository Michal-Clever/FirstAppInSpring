package com.example.FirstAppInSpring.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password) {

        if (login.equals("admin") && password.equals("admin")) {
            return "Zalogowano!!!";
        }
        return "Błędne dane";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
  //  @ResponseBody
    public String register(@RequestParam("login") String login,
                           @RequestParam("password") String password,
                           @RequestParam("passwordReapet") String passwordReapet,
                           @RequestParam("email") String email,
                           Model model) {
        if (!password.equals(passwordReapet)) {
          //  return "Hasła nie są takie same";
            model.addAttribute("info", "Hasła się nie zgadzają!");
            return "register";
        }
        //return "Konto utworzone";
        model.addAttribute("info","Zarejestrowano :D");
        return "register";
    }

}
