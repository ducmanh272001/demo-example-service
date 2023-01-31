package com.afs.backend.example.controller;


import com.afs.backend.base.common.response.Response;
import com.afs.backend.base.common.service.ResponseService;
import com.afs.backend.base.controller.BaseController;
import com.afs.backend.example.dto.groupServices.CreateGroupServicesDto;
import com.afs.backend.example.dto.groupServices.GroupServicesDto;
import com.afs.backend.example.dto.groupServices.UpdateGroupServicesDto;
import com.afs.backend.example.entities.GroupServicesEntity;
import com.afs.backend.example.service.groupServices.GroupServices;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/public-api/v1/groupService")
public class GroupServiceController extends BaseController<GroupServices> {


    protected GroupServiceController(GroupServices service, ResponseService responseService) {
        super(service, responseService);
    }



    @GetMapping("/list")
    public Response<List<GroupServicesDto>> getListGroupServices() {
        List<GroupServicesEntity> groupServicesEntities = getService().getGroupServicesList();
        List<GroupServicesDto> groupServicesDtos = getService().getGroupServicesDtoList(groupServicesEntities);
        return success(groupServicesDtos);
    }


    @GetMapping
    public Response<GroupServicesDto> getGroupServices(@RequestParam Long groupServiceId) {
        GroupServicesEntity groupServicesEntity = getService().getGroupServicesEntity(groupServiceId);
        GroupServicesDto groupServicesDto = getService().getGroupServicesDto(groupServicesEntity);
        return success(groupServicesDto);
    }

    @PostMapping
    public Response<GroupServicesDto> createGroupServices
            (@RequestBody @Valid CreateGroupServicesDto createGroupServicesDto){
        GroupServicesEntity entity = getService().createGroupServicesEntity(createGroupServicesDto);
        GroupServicesDto groupServicesDto = getService().getGroupServicesDto(entity);
        return success(groupServicesDto);
    }

    @PutMapping
    public Response<GroupServicesDto> updateGroupServices
            (@RequestBody @Valid UpdateGroupServicesDto updateGroupServicesDto){
        GroupServicesEntity entity = getService().updateGroupServicesEntity(updateGroupServicesDto);
        GroupServicesDto groupServicesDto = getService().getGroupServicesDto(entity);
        return success(groupServicesDto);
    }

    @DeleteMapping
    public Response<?> deleteGroupServices(@RequestParam Long groupServicesId){
        getService().deleteGroupServices(groupServicesId);
        return success();
    }
}
