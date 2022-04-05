package com.hpbe.highperspicacitybe.controller;

import com.hpbe.highperspicacitybe.model.User;
import com.hpbe.highperspicacitybe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/show")
    public String show() {
        return "user";
    }

    @PostMapping(value = "/getUser")
    public String getUser(Integer id, Model model) {
        User user = userService.selectUserById(id);
        model.addAttribute("users", user);
        if (user != null) return "getUser";
        else return "error";
    }
}
