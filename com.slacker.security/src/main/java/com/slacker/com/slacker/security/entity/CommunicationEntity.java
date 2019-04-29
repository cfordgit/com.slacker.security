package com.slacker.com.slacker.security.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="UserCommunications")
public class CommunicationEntity {
    @Id
    public Long id;
    public Long userId;
    public String communicationType;
    public String communicationValue;
    public Boolean isValid;
    public Boolean isDefault;
}