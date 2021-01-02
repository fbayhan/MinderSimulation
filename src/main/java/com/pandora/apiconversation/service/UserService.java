package com.pandora.apiconversation.service;


import com.pandora.apiconversation.dto.UserDTO;
import com.pandora.apiconversation.model.User;
import com.pandora.apiconversation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public  String newUser(UserDTO userDTO){
    User user=new User();
    user.setUserName(userDTO.getUserName());
    user.seteMail(userDTO.geteMail());
    user.setPassWord(userDTO.getPassWord());
    user.setInsertTime(new Date());
    userRepository.save(user);
    return "ok";
}

}
