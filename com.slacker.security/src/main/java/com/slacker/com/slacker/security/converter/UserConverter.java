package com.slacker.com.slacker.security.converter;

import com.slacker.com.slacker.security.dto.User;

import java.util.stream.Collectors;

import com.slacker.com.slacker.security.dto.Communication;
import com.slacker.com.slacker.security.entity.CommunicationEntity;
import com.slacker.com.slacker.security.entity.UserEntity;

public class UserConverter {
    public User toDto(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setUserName(userEntity.getUserName());
        user.setFirstName(userEntity.getFirstName());
        user.setLastName(userEntity.getLastName());
        user.setCommunications(userEntity.getCommunications().stream().map(c -> toCommunicationDto(c)).collect(Collectors.toList()));
        return user;
    }

    public UserEntity toEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setUserName(user.getUserName());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setCommunications(user.getCommunications().stream().map(c -> toCommunicationEntity(c)).collect(Collectors.toList()));
        return userEntity;
    }

    public Communication toCommunicationDto(CommunicationEntity communicationEntity) {
        Communication communication = new Communication();
        communication.setId(communicationEntity.getId());
        communication.setCommunicationType(communicationEntity.getCommunicationType());
        communication.setCommunicationValue(communicationEntity.getCommunicationValue());
        communication.setIsValid(communicationEntity.getIsValid());
        communication.setIsDefault(communicationEntity.getIsDefault());
        return communication;
    }

    public CommunicationEntity toCommunicationEntity(Communication communication) {
        CommunicationEntity communicationEntity = new CommunicationEntity();
        communicationEntity.setId(communication.getId());
        communicationEntity.setCommunicationType(communication.getCommunicationType());
        communicationEntity.setCommunicationValue(communication.getCommunicationValue());
        communicationEntity.setIsValid(communication.getIsValid());
        communicationEntity.setIsDefault(communication.getIsDefault());
        return communicationEntity;
    }
}