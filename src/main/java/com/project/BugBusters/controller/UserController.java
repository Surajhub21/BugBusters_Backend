package com.project.BugBusters.controller;

import com.project.BugBusters.Entity.Users;
import com.project.BugBusters.service.UserMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserMailService userService;

    @PostMapping
    public void sendEmail(@RequestBody Users users){

        userService.sendEmail(users);

    }
}
