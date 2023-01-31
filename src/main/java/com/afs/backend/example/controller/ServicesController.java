package com.afs.backend.example.controller;


import com.afs.backend.base.common.response.Response;
import com.afs.backend.base.common.service.ResponseService;
import com.afs.backend.base.controller.BaseController;
import com.afs.backend.example.dto.groupServices.CreateGroupServicesDto;
import com.afs.backend.example.dto.groupServices.GroupServicesDto;
import com.afs.backend.example.dto.groupServices.UpdateGroupServicesDto;
import com.afs.backend.example.dto.services.CreateServicesDto;
import com.afs.backend.example.dto.services.ServicesDto;
import com.afs.backend.example.dto.services.UpdateServicesDto;
import com.afs.backend.example.entities.GroupServicesEntity;
import com.afs.backend.example.entities.ServicesEntity;
import com.afs.backend.example.service.services.ServicesInServices;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/public-api/v1/services")
public class ServicesController extends BaseController<ServicesInServices> {

    protected ServicesController(ServicesInServices service, ResponseService responseService) {
        super(service, responseService);
    }

    @GetMapping("/list-from-questionId")
    public Response<List<ServicesDto>> getListServicesFromQuestionId(@RequestParam Long groupServicesId) {
        List<ServicesEntity> servicesEntities = getService().getListServicesFromGroupServicesId(groupServicesId);
        List<ServicesDto> servicesDtos = getService().getListServicesDtoFromListServicesEntity(servicesEntities);
        return success(servicesDtos);
    }


    @GetMapping
    public Response<ServicesDto> getServices(@RequestParam Long serviceId) {
        ServicesEntity servicesEntity = getService().getServicesEntiy(serviceId);
        ServicesDto servicesDto = getService().getServicesDtoFromServices(servicesEntity);
        return success(servicesDto);
    }

    @PostMapping
    public Response<ServicesDto> createServices
            (@RequestBody @Valid CreateServicesDto createServicesDto) {
        ServicesEntity entity = getService().createService(createServicesDto);
        ServicesDto servicesDto = getService().getServicesDtoFromServices(entity);
        return success(servicesDto);
    }

    @PutMapping
    public Response<ServicesDto> updateServices
            (@RequestBody @Valid UpdateServicesDto updateServicesDto) {
        ServicesEntity entity = getService().updateServices(updateServicesDto);
        ServicesDto servicesDto = getService().getServicesDtoFromServices(entity);
        return success(servicesDto);
    }

    @DeleteMapping
    public Response<?> deleteServices(@RequestParam Long servicesId) {
        getService().deleteServices(servicesId);
        return success();
    }
}
