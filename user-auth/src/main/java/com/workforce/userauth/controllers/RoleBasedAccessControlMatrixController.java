package com.workforce.userauth.controllers;

import com.workforce.userauth.constants.EndpointConstants;
import com.workforce.userauth.dto.ApiResponseDto;
import com.workforce.userauth.dto.request.rbac.RbacMatrixRequestDto;
import com.workforce.userauth.services.RoleBasedAccessControlMatrixService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = EndpointConstants.RBAC_BASE_ENDPOINT)
public class RoleBasedAccessControlMatrixController {

    @Autowired
    private RoleBasedAccessControlMatrixService roleBasedAccessControlMatrixService;

    @PostMapping(value = EndpointConstants.RBAC_CREATE_ENDPOINT)
    public ResponseEntity<ApiResponseDto<?>> createRbacMatrix(
            @RequestBody @Valid RbacMatrixRequestDto rbacMatrixRequestDto
    ) {
        ApiResponseDto<?> responseDto = this.roleBasedAccessControlMatrixService.createRbacMatrix(rbacMatrixRequestDto);
        return new ResponseEntity<>(responseDto, responseDto.getStatusCode());
    }

    @GetMapping(value = EndpointConstants.RBAC_GET_ENDPOINT)
    public ResponseEntity<ApiResponseDto<?>> getRbacMatrix() {
        ApiResponseDto<?> responseDto = this.roleBasedAccessControlMatrixService.getRbacMatrix();
        return new ResponseEntity<>(responseDto, responseDto.getStatusCode());
    }

    @PutMapping(value = EndpointConstants.RBAC_UPDATE_ENDPOINT)
    public ResponseEntity<ApiResponseDto<?>> updateRbacMatrix() {
        ApiResponseDto<?> responseDto = this.roleBasedAccessControlMatrixService.updateRbacMatrix();
        return new ResponseEntity<>(responseDto, responseDto.getStatusCode());
    }

    @DeleteMapping(value = EndpointConstants.RBAC_DELETE_ENDPOINT)
    public ResponseEntity<ApiResponseDto<?>> deleteRbacMatrix() {
        ApiResponseDto<?> responseDto = this.roleBasedAccessControlMatrixService.deleteRbacMatrix();
        return new ResponseEntity<>(responseDto, responseDto.getStatusCode());
    }

}
