package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.UserDTO;
import com.pandora.apiconversation.repository.UserRepository;
import com.pandora.apiconversation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
UserService userService;


    @PostMapping("newuser")
    public String newUser(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.toString());

String result= userService.newUser(userDTO);
return  result;
    }

}
