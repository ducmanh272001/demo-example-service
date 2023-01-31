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
@Table(name = "group_services")
public class GroupServicesEntity extends SoftDeleteEntity {

    private String code;
    private String name;
    private String alias;
    private String imageUrl;
    private String desription;
    private Boolean isActive;

}
