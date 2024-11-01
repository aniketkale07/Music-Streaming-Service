package music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String Login(Model model) {
        return "login";
    }

    // it will check the login
    @PostMapping("/checkLogin")
    public void CheckLogin(Model model) {
    }

    // Create the new user
    @GetMapping("/signup")
    public String Signup(Model model) {
        return "signup";
    }

    @PostMapping("/newuser")
    public void NewUser(Model model) {
    }

}
