package com.emre.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveBookRequestDto {
    private String bookName;
    private List<Long> authorIds;
    private Long publisherId;
    private List<Long> typeIds;
    private Integer pages;
    private Long printingDate;
}
