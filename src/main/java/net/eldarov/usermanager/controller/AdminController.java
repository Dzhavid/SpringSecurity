package net.eldarov.usermanager.controller;

import net.eldarov.usermanager.model.User;
import net.eldarov.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;

    @Autowired
    public AdminController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("listUsers",this.userService.listUser());
        return "admin";
    }

    @DeleteMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id){
        this.userService.removeUser(id);
        return "admin";
    }

    @PostMapping(value = "/users/add")
    public String addUser(@ModelAttribute("user") User user){
        if(user.getId() == 0){
            this.userService.addUser(user);
        }else {
            this.userService.updateUser(user);
        }
        return "admin";
    }

    @PostMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.listUser());
        return "admin";
    }

}
