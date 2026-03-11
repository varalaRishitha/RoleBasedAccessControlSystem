package com.uniquehire.rolemanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PermissionRequestDto {
    @NotBlank(message="Name is required")

    private String name;
    private String description;
}
