package com.uniquehire.rolemanagement.service;



import com.uniquehire.rolemanagement.dto.request.PermissionRequestDto;
import com.uniquehire.rolemanagement.dto.response.ApiResponse;
import com.uniquehire.rolemanagement.dto.response.PermissionResponseDto;

import java.util.List;

public interface PermissionService {

    ApiResponse<PermissionResponseDto> createPermission(PermissionRequestDto dto);

    ApiResponse<PermissionResponseDto> getPermissionById(Long id);

    ApiResponse<List<PermissionResponseDto>> getAllPermissions(int page, int size);

    ApiResponse<PermissionResponseDto> updatePermission(Long id, PermissionRequestDto dto);

    ApiResponse<String> deletePermission(Long id);
}