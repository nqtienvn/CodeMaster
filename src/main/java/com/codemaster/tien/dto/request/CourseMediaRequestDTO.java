package com.codemaster.tien.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseMediaRequestDTO {
    private String courseImg;
    private LocalDateTime updatedAt;
    private String videoUrlPreview;
}
