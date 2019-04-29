package com.slacker.com.slacker.security.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.slacker.com.slacker.security.entity.CommunicationEntity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="Users")
public class UserEntity {
    @Id
    public Long id;    
    public String userName;
    public String firstName;
    public String lastName;
    public Boolean isActive;
    public Boolean isVerified;
    public List<CommunicationEntity> communications;
}