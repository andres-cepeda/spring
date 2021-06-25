package co.edu.sena.springmvc2242753.controllers;

import co.edu.sena.springmvc2242753.beans.Login;
import co.edu.sena.springmvc2242753.beans.User;
import co.edu.sena.springmvc2242753.exceptions.ApplicationException;
import co.edu.sena.springmvc2242753.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login")Login login)
    {
        User user  = userRepository.searchByName(login.getUsername());
        if(user==null)
        {
            throw new ApplicationException("User not found");
        }
        return "search";
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of Login Controller");
        return "error";
    }
}
