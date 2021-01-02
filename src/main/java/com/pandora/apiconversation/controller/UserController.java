package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.ForgotPasswordDTO;
import com.pandora.apiconversation.dto.LoginDTO;
import com.pandora.apiconversation.dto.UserAttributesDTO;
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
    public String newUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO.toString());

        String result = userService.newUser(userDTO);
        return result;
    }

    public String login(@RequestBody LoginDTO loginDTO){

        return  "user controller worked";
    }

    public String addUserAttributes(UserAttributesDTO attributesDTO){
        return  "user attributes added";
    }
    public  String editUserAttributes(UserAttributesDTO attributesDTO){
        return  "edit user attributes worked";
    }
    public  String forgetPassword(ForgotPasswordDTO forgotPasswordDTO){
        return  "forget passworddto worked";
    }



}
