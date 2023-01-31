package com.afs.backend.example.dto.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicesDto {

    private Long id;
    private String code;
    private String name;
    private String alias;
    private Long groupServiceId;
    private String imageUrl;
    private String partnerCode;
    private Float price;
    private String desription;
}
