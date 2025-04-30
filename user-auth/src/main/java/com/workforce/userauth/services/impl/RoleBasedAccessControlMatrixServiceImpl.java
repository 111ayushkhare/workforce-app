package com.workforce.userauth.services.impl;

import com.workforce.userauth.dto.ApiResponseDto;
import com.workforce.userauth.dto.request.rbac.RbacMatrixRequestDto;
import com.workforce.userauth.repositories.PermissionsRepository;
import com.workforce.userauth.repositories.ResourcesRepository;
import com.workforce.userauth.repositories.ServicesRepository;
import com.workforce.userauth.services.RoleBasedAccessControlMatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RoleBasedAccessControlMatrixServiceImpl implements RoleBasedAccessControlMatrixService {
    @Autowired
    private ServicesRepository servicesRepository;

    @Autowired
    private ResourcesRepository resourcesRepository;

    @Autowired
    private PermissionsRepository permissionsRepository;


    @Override
    public ApiResponseDto<?> createRbacMatrix(RbacMatrixRequestDto rbacMatrixRequestDto) {
        return new ApiResponseDto<Object>(HttpStatus.CREATED, "CREATED", null);
    }

    // TODO
    @Override
    public ApiResponseDto<?>  getRbacMatrix() {
        return null;
    }

    // TODO
    @Override
    public ApiResponseDto<?>  updateRbacMatrix() {
        return null;
    }

    // TODO
    @Override
    public ApiResponseDto<?>  deleteRbacMatrix() {
        return null;
    }
}
