package music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

@GetMapping("/home")
public String home(){
    return "home";
}

@GetMapping("/about")
public String about(){
    return "about";
}

@GetMapping("/contactus")
public String contactUs(){
    return "contact-us";
}

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
