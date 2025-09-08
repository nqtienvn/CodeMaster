package com.codemaster.tien.dto;

import com.codemaster.tien.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetailDTO {
    private Long courseId;
    private String title;
    private String description;
    private Double price;
    private Double discount;
    private String courseImg;
    private Integer duration;
    private String categoryName;
    private String videoUrlPreview;
    private Integer totalLessons;
    private Integer totalStudentEnrolled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private User instructor;
    private String status;
    private String courseLevel; //beginner, intermediate, advanced
}
