package com.slacker.com.slacker.security.repository;

import com.slacker.com.slacker.security.entity.CommunicationEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository<CommunicationEntity> extends JpaRepository<CommunicationEntity, Long> {
    
}