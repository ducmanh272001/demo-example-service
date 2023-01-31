package com.afs.backend.example.service.services;

import com.afs.backend.example.dto.services.CreateServicesDto;
import com.afs.backend.example.dto.services.ServicesDto;
import com.afs.backend.example.dto.services.UpdateServicesDto;
import com.afs.backend.example.entities.ServicesEntity;

import java.util.List;

public interface ServicesInServices {

    List<ServicesEntity> getListServicesFromGroupServicesId(Long groupServiceId);

    List<ServicesDto> getListServicesDtoFromListServicesEntity(List<ServicesEntity> servicesEntities);

    ServicesDto getServicesDtoFromServices(ServicesEntity entity);

    ServicesEntity createService(CreateServicesDto createServicesDto);

    ServicesEntity updateServices(UpdateServicesDto updateServicesDto);

    ServicesEntity getServicesEntiy(Long servicesId);

    void deleteServices(Long servicesId);




}
