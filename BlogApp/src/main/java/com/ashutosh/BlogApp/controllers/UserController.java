package com.ashutosh.BlogApp.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<Object> getUsers(){
        HashMap<String,Object> map =new HashMap<>();
        map.put("id",1);
        map.put("firstName","Ashutosh");
        map.put("lastName","Singh");
        map.put("email","ashutosh.singh@gmail.com");
        return  new ResponseEntity<>(map, HttpStatus.CREATED);

    }
}
