package com.cybertek.controller;

import com.cybertek.entity.ResponseWrapper;
import com.cybertek.entity.User;
import com.cybertek.exception.ServiceException;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
@RequestMapping("/")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/read")
//    @PreAuthorize(value = "hasAuthority('USER')")
    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
    public ResponseEntity<ResponseWrapper> readAll(){
        List<User> users = userService.getAll();
        return ResponseEntity.ok(new ResponseWrapper("Done", users));
    }

    @PostMapping("/create-user")
    public ResponseEntity<ResponseWrapper> createAccount(@RequestBody User user) throws ServiceException {
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok(new ResponseWrapper("User has been created successfully", createdUser));
    }
}
