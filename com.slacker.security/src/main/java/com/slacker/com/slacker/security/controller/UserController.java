package com.slacker.com.slacker.security.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.websocket.server.PathParam;

import com.slacker.com.slacker.security.dto.User;
import com.slacker.com.slacker.security.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<User> getMe(OAuth2AuthenticationToken currentUser) throws NotFoundException {
        
        if (!currentUser.isAuthenticated()) 
            throw new NotFoundException("User not Found");
            
        return ResponseEntity.ok(userService.findByEmail(currentUser.toString()));
    }
    
    @GetMapping("/")
    public ResponseEntity<User[]> get() {
        return ResponseEntity.ok((User[]) userService.findAll().toArray());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathParam("id") Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}