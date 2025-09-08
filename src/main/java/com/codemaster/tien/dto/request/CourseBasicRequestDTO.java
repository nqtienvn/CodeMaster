package com.codemaster.tien.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseBasicRequestDTO {
    @NotBlank(message = "Name of course is not empty")
    private String title;
    @NotBlank(message = "Desciption of course is not empty")
    private String description;
    @NotBlank(message = "Category Name of course is not empty")
    private String categoryName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @NotBlank(message = "Level of people join in course is not empty")
    private String courseLevel;
}
