package org.launchcode.spaday.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    // user/add
    @GetMapping
    public String displayAddUserForm() {
        return "/user/add"; // return the path to add.html
    }

}
