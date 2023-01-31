package com.afs.backend.example.repository;


import com.afs.backend.base.repository.SoftDeleteJPA;
import com.afs.backend.example.entities.GroupServicesEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupServicesRepository extends SoftDeleteJPA<GroupServicesEntity, Long> {
    Optional<GroupServicesEntity> findByName(String name);
    GroupServicesEntity findByAlias(String alias);
}
