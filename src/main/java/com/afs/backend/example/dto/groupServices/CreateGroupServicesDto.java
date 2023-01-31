package com.afs.backend.example.dto.groupServices;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateGroupServicesDto {

    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotBlank
    private String alias;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private String desription;
    @NotNull
    private Boolean isActive;

}
