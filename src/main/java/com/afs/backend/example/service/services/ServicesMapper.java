package com.afs.backend.example.service.services;


import com.afs.backend.example.dto.services.CreateServicesDto;
import com.afs.backend.example.dto.services.ServicesDto;
import com.afs.backend.example.dto.services.UpdateServicesDto;
import com.afs.backend.example.entities.ServicesEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ServicesMapper {

    //Chuyển từ ListServicesEntity Sang ListServicesDto
    List<ServicesDto> getListServicesDtoFromListServices(List<ServicesEntity> servicesEntities);

    ServicesDto getServicesDtoFromServices(ServicesEntity servicesEntity);

    ServicesEntity getServicesFromServicesDto(ServicesDto servicesDto);

    ServicesEntity createServicesFromServicesDto(CreateServicesDto createServicesDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateServicesFromServicesDto(@MappingTarget ServicesEntity servicesEntity
                                       ,UpdateServicesDto updateServicesDto);
}
