package com.afs.backend.example.service.groupServices;


import com.afs.backend.example.dto.groupServices.CreateGroupServicesDto;
import com.afs.backend.example.dto.groupServices.GroupServicesDto;
import com.afs.backend.example.dto.groupServices.UpdateGroupServicesDto;
import com.afs.backend.example.entities.GroupServicesEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GroupServicesMapper {

    //Chuyển Đổ từ List GroupServcies sang GroupServicesDto
    List<GroupServicesDto> getListGroupServicesDtoFromGroupServices(List<GroupServicesEntity> servicesEntityList);

    //Chuyển từ entity GroupServices Sang GroupServiesDto
    GroupServicesDto getGroupServicesDtoFromGroupServices(GroupServicesEntity groupServices);

    GroupServicesEntity getGroupServicesFromCreateGroupServices(CreateGroupServicesDto createGroupServicesDto);

    //Chuyên từ dto sang entity
    GroupServicesEntity getGroupServicesFromGroupServicesDto(GroupServicesDto groupServicesDto);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateGroupFromUpdateGroupServicesDto(@MappingTarget GroupServicesEntity groupServicesEntity,
                                               UpdateGroupServicesDto updateGroupServicesDto);

}
