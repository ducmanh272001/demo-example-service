package com.afs.backend.example.dto.groupServices;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupServicesDto {
    private Long id;
    private String code;
    private String name;
    private String alias;
    private String imageUrl;
    private String desription;
    private Boolean isActive;
}
