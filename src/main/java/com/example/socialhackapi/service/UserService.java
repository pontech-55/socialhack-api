package com.example.socialhackapi.service;

import com.example.socialhackapi.model.User;
import com.example.socialhackapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String hello() {
        return "Hello";
    }

    public String register(String username, String email, String password, Boolean isEntity) {
        String hashedPassword = password + "hashed";
        if(userRepository.findByEmailOrUsername(email, username).isPresent()){
            return "Account or username already in use.";
        }
        userRepository.save(new User(username, email, hashedPassword, isEntity));
        return new User(username, email, hashedPassword + "token", isEntity).toJson();
    }

    public String login(String email, String password) {
        String hashedPassword = password + "hashed";
        Optional<User> userOptional = userRepository.findByEmailAndPassword(email, hashedPassword);
        if(userOptional.isPresent()) {
            return (new User(userOptional.get().getUsername(),
                    email,
                    hashedPassword + "token",
                    userOptional.get().getEntity())
            ).toJson();
        } else return "Failed to log in.";
    }

    public String checkPassword(Long id) {
        return userRepository.findPasswordById(id);
    }
}
