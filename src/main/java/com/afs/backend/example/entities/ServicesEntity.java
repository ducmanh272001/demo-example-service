package com.afs.backend.example.entities;


import com.afs.backend.base.entity.SoftDeleteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "services")
public class ServicesEntity extends SoftDeleteEntity {

    private String code;
    private String name;
    private String alias;
    private Long groupServiceId;
    private String imageUrl;
    private String partnerCode;
    private Float price;
    private String desription;
}
