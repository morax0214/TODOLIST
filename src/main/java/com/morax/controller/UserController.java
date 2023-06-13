package com.morax.controller;

import com.morax.entity.Result;
import com.morax.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    /**
     * Sign in
     */
    private Result signIn(){

        return null;
    }

    /**
     * Sign up
     */
    @RequestMapping("/signUp")
    private Result signUp(@RequestBody Map<String,String> map){

        userService.signUp(map);


        return null;
    }
}
