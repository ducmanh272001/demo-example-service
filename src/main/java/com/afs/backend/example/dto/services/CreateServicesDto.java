package com.afs.backend.example.dto.services;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateServicesDto {

    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotBlank
    private String alias;
    @NotNull
    private Long groupServiceId;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private String partnerCode;
    @NotNull
    private Float price;
    @NotBlank
    private String desription;
}
