package com.slacker.com.slacker.security.repository;

import com.slacker.com.slacker.security.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<UserEntity> extends JpaRepository<UserEntity, Long> {

}