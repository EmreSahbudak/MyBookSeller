package com.emre.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SavePublisherRequestDto {
    @NotBlank
    private String publisherName;
    @NotBlank
    private String address;
    @NotNull
    private String phoneNumber;
}
