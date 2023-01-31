package com.afs.backend.example.service.groupServices;


import com.afs.backend.example.dto.groupServices.CreateGroupServicesDto;
import com.afs.backend.example.dto.groupServices.UpdateGroupServicesDto;
import com.afs.backend.example.entities.GroupServicesEntity;
import com.afs.backend.example.dto.groupServices.GroupServicesDto;

import java.util.List;

public interface GroupServices {

    GroupServicesEntity getGroupServicesEntity (Long id);

    GroupServicesDto getGroupServicesDto (GroupServicesEntity groupServicesEntity);

    GroupServicesEntity createGroupServicesEntity(CreateGroupServicesDto createGroupServicesDto);

    GroupServicesEntity updateGroupServicesEntity(UpdateGroupServicesDto updateGroupServicesDto);

    List<GroupServicesEntity> getGroupServicesList ();

    List<GroupServicesDto> getGroupServicesDtoList(List<GroupServicesEntity> groupServicesEntities);

    void deleteGroupServices(Long id);

}
