package net.eldarov.usermanager.controller;

import net.eldarov.usermanager.model.User;
import net.eldarov.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired(required = true)
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "user")
    public String infOfUser(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("listUsers",this.userService.listUser());
        return "user";
    }

    @RequestMapping(value = "users",method = RequestMethod.GET)
    public String listUsers(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("listUsers",this.userService.listUser());
        return "admin";
    }

    @RequestMapping(value = "/users/add",method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        if(user.getId() == 0){
            this.userService.addUser(user);
        }else {
            this.userService.updateUser(user);
        }
        return "admin";
    }

    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id){
        this.userService.removeUser(id);
        return "admin";
    }
    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.listUser());
        return "admin";
    }
    @RequestMapping("userdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        return "userdata";
    }
}
