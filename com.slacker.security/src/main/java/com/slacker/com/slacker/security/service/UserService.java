package com.slacker.com.slacker.security.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.slacker.com.slacker.security.entity.CommunicationEntity;
import com.slacker.com.slacker.security.converter.UserConverter;
import com.slacker.com.slacker.security.dto.User;
import com.slacker.com.slacker.security.entity.UserEntity;
import com.slacker.com.slacker.security.repository.CommunicationRepository;
import com.slacker.com.slacker.security.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository<UserEntity> userRepository;
    private CommunicationRepository<CommunicationEntity> communicationRepository;
    private UserConverter userConverter = new UserConverter();

    public UserService(UserRepository<UserEntity> userRepository, CommunicationRepository communicationRepository) {
        this.userRepository = userRepository;
        this.communicationRepository = communicationRepository;
    }

    // @PersistenceContext
    // EntityManager em;
    
    public List<User> findAll() {
        List<UserEntity> users = userRepository.findAll(); //em.createNamedQuery("User.findAll", UserEntity.class).getResultList();
        return users.stream().map(user -> userConverter.toDto(user)).collect(Collectors.toList());
    }
    
    public User findById(Long id) {
        // User user = userConverter.toDto(em.createNamedQuery("User.findById", UserEntity.class)
        //         .setParameter("id", id)
        //         .getSingleResult());
        Optional<UserEntity> userEntity = userRepository.findById(id);        
        User user = userConverter.toDto(userEntity.get());
        return user;
    }

    public User findByEmail(String email) {
        CommunicationEntity communicationEntity = new CommunicationEntity(); // communicationRepository.findByCommunicationValue(email);
        return findById(communicationEntity.getUserId());
    }
}