package com.afs.backend.example.service.impl;


import com.afs.backend.base.common.exception.CommandExceptionBuilder;
import com.afs.backend.base.common.service.Loggable;
import com.afs.backend.example.common.constants.ErrorCodes;
import com.afs.backend.example.dto.services.CreateServicesDto;
import com.afs.backend.example.dto.services.ServicesDto;
import com.afs.backend.example.dto.services.UpdateServicesDto;
import com.afs.backend.example.entities.ServicesEntity;
import com.afs.backend.example.repository.ServicesRepository;
import com.afs.backend.example.service.services.ServicesInServices;
import com.afs.backend.example.service.services.ServicesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicesImpl implements ServicesInServices, Loggable {

    private final ServicesMapper mapper;
    private final ServicesRepository repository;


    @Override
    public List<ServicesEntity> getListServicesFromGroupServicesId(Long groupServiceId) {
        List<ServicesEntity> entityList = repository.findByGroupServiceId(groupServiceId);
        return entityList;
    }

    @Override
    public List<ServicesDto> getListServicesDtoFromListServicesEntity(List<ServicesEntity> servicesEntities) {
        return mapper.getListServicesDtoFromListServices(servicesEntities);
    }

    @Override
    public ServicesDto getServicesDtoFromServices(ServicesEntity entity) {
        return mapper.getServicesDtoFromServices(entity);
    }

    @Override
    public ServicesEntity createService(CreateServicesDto createServicesDto) {
        return repository.save(mapper.createServicesFromServicesDto(createServicesDto));
    }

    @Override
    public ServicesEntity updateServices(UpdateServicesDto updateServicesDto) {
        ServicesEntity servicesEntity = getServicesEntiy(updateServicesDto.getId());
        mapper.updateServicesFromServicesDto(servicesEntity, updateServicesDto);
        return repository.save(servicesEntity);
    }

    @Override
    public ServicesEntity getServicesEntiy(Long servicesId) {
        return repository.findById(servicesId)
                .orElseThrow(() -> CommandExceptionBuilder.exception(ErrorCodes.ANSWER_NOT_FOUND, servicesId));
    }

    @Override
    public void deleteServices(Long servicesId) {
        repository.deleteById(servicesId);
    }
}
