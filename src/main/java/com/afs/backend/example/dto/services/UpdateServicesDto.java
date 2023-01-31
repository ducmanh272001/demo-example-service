package com.afs.backend.example.dto.services;


import com.afs.backend.base.common.validator.NullOrNotBlank;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UpdateServicesDto {


    @NotNull
    private Long id;
    @NullOrNotBlank
    private String code;
    @NullOrNotBlank
    private String name;
    @NullOrNotBlank
    private String alias;
    @NotNull
    private Long groupServiceId;
    @NullOrNotBlank
    private String imageUrl;
    @NullOrNotBlank
    private String partnerCode;
    @NotNull
    private Float price;
    @NullOrNotBlank
    private String desription;
}
