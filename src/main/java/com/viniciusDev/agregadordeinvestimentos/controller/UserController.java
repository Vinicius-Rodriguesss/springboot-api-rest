package com.viniciusDev.agregadordeinvestimentos.controller;

import com.viniciusDev.agregadordeinvestimentos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @PostMapping
        public ResponseEntity<User> createUser(@RequestBody String body){
            return  null;
        }
}
