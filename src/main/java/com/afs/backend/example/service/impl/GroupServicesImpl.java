package com.afs.backend.example.service.impl;

import com.afs.backend.base.common.exception.CommandExceptionBuilder;
import com.afs.backend.base.common.service.Loggable;
import com.afs.backend.example.common.constants.ErrorCodes;
import com.afs.backend.example.dto.groupServices.CreateGroupServicesDto;
import com.afs.backend.example.dto.groupServices.UpdateGroupServicesDto;
import com.afs.backend.example.entities.GroupServicesEntity;
import com.afs.backend.example.repository.GroupServicesRepository;
import com.afs.backend.example.service.groupServices.GroupServices;
import com.afs.backend.example.dto.groupServices.GroupServicesDto;
import com.afs.backend.example.service.groupServices.GroupServicesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupServicesImpl implements GroupServices, Loggable {


    private final GroupServicesRepository repository;
    private final GroupServicesMapper mapper;

    @Override
    public GroupServicesEntity getGroupServicesEntity(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> CommandExceptionBuilder.exception(ErrorCodes.ANSWER_NOT_FOUND, id));
    }

    @Override
    public GroupServicesDto getGroupServicesDto(GroupServicesEntity groupServicesEntity) {
        return mapper.getGroupServicesDtoFromGroupServices(groupServicesEntity);
    }

    @Override
    public GroupServicesEntity createGroupServicesEntity(CreateGroupServicesDto createGroupServicesDto) {
        GroupServicesEntity groupServicesEntity = mapper.
                getGroupServicesFromCreateGroupServices(createGroupServicesDto);
        return repository.save(groupServicesEntity);
    }

    @Override
    public GroupServicesEntity updateGroupServicesEntity(UpdateGroupServicesDto updateGroupServicesDto) {
        GroupServicesEntity entity = getGroupServicesEntity(updateGroupServicesDto.getId());
        mapper.updateGroupFromUpdateGroupServicesDto(entity, updateGroupServicesDto);
        return repository.save(entity);
    }

    @Override
    public List<GroupServicesEntity> getGroupServicesList() {
        return repository.findAll();
    }

    @Override
    public List<GroupServicesDto> getGroupServicesDtoList(List<GroupServicesEntity> groupServicesEntities) {
        return mapper.getListGroupServicesDtoFromGroupServices(groupServicesEntities);
    }

    @Override
    public void deleteGroupServices(Long id) {
       repository.deleteById(id);
    }
}
