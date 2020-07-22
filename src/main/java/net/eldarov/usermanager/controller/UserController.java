package net.eldarov.usermanager.controller;
/*
import net.eldarov.usermanager.model.User;
import net.eldarov.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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


    @RequestMapping(value = "users",method = RequestMethod.GET)
    public String listUsers(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("listUsers",this.userService.listUser());
        return "users";
    }

    @RequestMapping(value = "/users/add",method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        //if(user.getId() == 0){
            this.userService.addUser(user);
        ///}else {
            //this.userService.updateUser(user);
        //}
        return "redirect:/users";
    }

    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") Long id){
        this.userService.removeUser(id);
        return "users";
    }
    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.listUser());
        return "users";
    }
    @RequestMapping("userdata/{id}")
    public String bookData(@PathVariable("id") Long id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        return "userdata";
    }
}

 */
import net.eldarov.usermanager.model.User;
import net.eldarov.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @RequestMapping(value = "users",method = RequestMethod.GET)
    public String listUsers(Model model){
        model.addAttribute("user",new User());
        model.addAttribute("listUsers",this.userService.listUser());
        return "users";
    }

    @RequestMapping(value = "/users/add",method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
            this.userService.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") Long id){
        this.userService.removeUser(id);
        return "redirect:/users";
    }
    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.listUser());
        return "users";
    }
    @RequestMapping("userdata/{id}")
    public String bookData(@PathVariable("id") Long id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));
        return "userdata";
    }
}
