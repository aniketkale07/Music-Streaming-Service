package music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import music.entity.User;
import music.form.SignupForm;
import music.helper.Message;
import music.helper.MessageType;
import music.service.UserService;
import music.serviceImpl.UserServiceImpl;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "contact-us";
    }

    @GetMapping("/login")
    public String Login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    // it will check the login
    @PostMapping("/checkLogin")
    public String CheckLogin(@ModelAttribute User user, HttpSession session) {
        String email = user.getEmail();
        String password = user.getPassword();
        User userDB = userService.findByEmail(email);
        if (userDB != null && userDB.getPassword().equals(password)) {

            System.out.println("login success");
            Message message = Message.builder().content("User Granted").type(MessageType.green).build();
            session.setAttribute("message", message);
            return "user/user-home";
        } else {
            System.out.println("login failed");
            Message message = Message.builder().content("Invalid User")
                    .type(MessageType.red).build();
                    session.setAttribute("message", message);
            return "login";
        }
    }

    // Create the new user
    @GetMapping("/signup")
    public String Signup(Model model) {
        model.addAttribute("user", new SignupForm());
        return "signup";
    }

    @PostMapping("/newuser")
    public String NewUser ( @ModelAttribute SignupForm user, HttpSession session) {

      
        // if the value coming from form is null
        if(user==null){
            Message message = Message.builder().content("Invalid User")
            .type(MessageType.red).build();
            session.setAttribute("message", message);
            return "signup";
        }
        User emailDB=userService.findByEmail(user.getEmail());

        if(emailDB==null){
            User savedUser = new User();
            savedUser.setEmail(user.getEmail());
            String encryptedPassword;


                 encryptedPassword = passwordEncoder.encode(user.getPassword()).toString();
                savedUser.setPassword(encryptedPassword);
                System.out.println(encryptedPassword);
            
                savedUser.setBirthDate(user.getBirthDate());
                String userName= user.getFirstName()+ " " +user.getLastName();
                savedUser.setUsername(userName);
            userService.saveUser(savedUser);
            Message message = Message.builder().content("new User Registred successfully").type(MessageType.green).build();
            session.setAttribute("message", message);
            System.out.println(savedUser);
            return "login";
        }else{
            Message message = Message.builder().content("Email already exist").type(MessageType.red).build();
            session.setAttribute("message", message);
            return "signup";
        }
    }
}
