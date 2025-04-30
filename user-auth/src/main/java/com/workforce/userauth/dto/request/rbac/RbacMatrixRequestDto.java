package com.workforce.userauth.dto.request.rbac;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RbacMatrixRequestDto {
    private ServiceMap[] serviceMap;
}

@Getter
@Setter
@AllArgsConstructor
class ServiceMap {
    private String service;
    private ResourceMap[] resourceMap;
}

@Getter
@Setter
@AllArgsConstructor
class ResourceMap {
    String resource;
    String[] permissions;
}
