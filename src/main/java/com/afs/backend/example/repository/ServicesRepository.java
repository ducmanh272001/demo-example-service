package com.afs.backend.example.repository;


import com.afs.backend.base.repository.SoftDeleteJPA;
import com.afs.backend.example.entities.ServicesEntity;
import feign.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository  extends SoftDeleteJPA<ServicesEntity, Long> {


    List<ServicesEntity> findByGroupServiceId (Long groupServiceId);


    @Query(
            value =
                    "select e from ServicesEntity e where (:groupServiceIds is not null"
                            + " and e.groupServiceId in :groupServiceIds)")
    List<ServicesEntity> findAllByGroupServiceIds(@Param("groupServiceIds") List<Long> groupServiceIds);

}
