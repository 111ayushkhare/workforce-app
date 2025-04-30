package com.workforce.userauth.dto.request.lookup;

import com.workforce.userauth.dto.request.RequestValidationDto;

public interface LookupByRequestDto extends RequestValidationDto {
    Long id = 0L;
    String name = "";
}
