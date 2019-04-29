package com.slacker.com.slacker.security.dto;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    public Long id;
    public String userName;
    public String firstName;
    public String lastName;
    public Boolean isActive;
    public Boolean isVerified;
    public List<Communication> communications;
}