package com.afs.backend.example.dto.groupServices;


import com.afs.backend.base.common.validator.NullOrNotBlank;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UpdateGroupServicesDto {


    @NotNull
    private Long id;
    @NullOrNotBlank
    private String code;
    @NullOrNotBlank
    private String name;
    @NullOrNotBlank
    private String alias;
    @NullOrNotBlank
    private String imageUrl;
    @NullOrNotBlank
    private String desription;
    private Boolean isActive;
}
