package org.example.jasan.service;


import org.example.jasan.model.Users;
import org.example.jasan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    private void setUsersRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<Users> getAll(){
        return userRepository.findAll();
    }
}
