package com.rest_rpg.common.error;

import jakarta.validation.constraints.NotBlank;

public record ErrorResponse(int status, @NotBlank String message) {
}
