package com.springapp.mvc.controller;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping(value="/", method = RequestMethod.GET)
    public String userList(Model model){
        List<User> users = this.userService.getAll();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping(value="addUser", method = RequestMethod.GET)
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value="addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        this.userService.insert(user);
        return"redirect:/";
    }

    @RequestMapping(value = "deleteUser/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable Integer id){
        this.userService.deleteUser(id);
        return "redirect:/";
    }

}