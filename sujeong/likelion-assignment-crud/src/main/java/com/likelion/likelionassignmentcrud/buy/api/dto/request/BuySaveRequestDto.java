package com.likelion.likelionassignmentcrud.buy.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record BuySaveRequestDto(
        @NotBlank(message = "제품을 필수로 입력해야 합니다.")
        String productId,

        @NotEmpty(message = "구매자를 필수로 입력해야 합니다.")
        @Size(min = 2, max = 20)
        String consumer,

        @NotNull(message = "배송일을 필수로 입력해야 합니다.")
        String delivery
) {
}