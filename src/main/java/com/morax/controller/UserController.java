package com.morax.controller;

import com.morax.entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

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



        return null;
    }
}
