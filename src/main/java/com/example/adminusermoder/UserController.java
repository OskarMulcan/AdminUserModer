package com.example.adminusermoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;


    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("allUsers", userDao.findAll());
        return "index";
    }

    @RequestMapping("/add/")
    public String save(@ModelAttribute("newUser") User user){
        userDao.save(user);
        return "add";
    }

    @DeleteMapping("/delete/")
    public String delete(@PathVariable Long id){
        userDao.deleteById(id);
        return "delete";
    }
}
