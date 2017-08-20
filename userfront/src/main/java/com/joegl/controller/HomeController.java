package com.joegl.controller;

import com.joegl.domain.User;
import com.joegl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user, Model model) {

        if (userService.checkUserExists(user.getUsername(), user.getEmail())) {

            System.out.println("you get here");

            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
                System.out.println("email exists");
            }


            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
                System.out.println("username exists");
            }

            return "signup";
        } else {
            System.out.println("you come to else");
//            Set<UserRole> userRoles = new HashSet<>();
//            userRoles.add(new UserRole(user, roleDao.findByName("USER")));
//            userService.createUser(user, userRoles);
            userService.save(user);

            return "redirect:/";
        }

    }
}
