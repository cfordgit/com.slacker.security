package com.slacker.com.slacker.security.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Communication {
    public Long id;
    public Long userId;
    public String communicationType;
    public String communicationValue;
    public Boolean isValid;
    public Boolean isDefault;
}