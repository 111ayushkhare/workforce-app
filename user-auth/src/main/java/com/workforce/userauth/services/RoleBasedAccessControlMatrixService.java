package com.workforce.userauth.services;

import com.workforce.userauth.dto.ApiResponseDto;
import com.workforce.userauth.dto.request.rbac.RbacMatrixRequestDto;

public interface RoleBasedAccessControlMatrixService {
    ApiResponseDto<?> createRbacMatrix(RbacMatrixRequestDto rbacMatrixRequestDto);
    ApiResponseDto<?> getRbacMatrix();
    ApiResponseDto<?> updateRbacMatrix();
    ApiResponseDto<?> deleteRbacMatrix();
}
