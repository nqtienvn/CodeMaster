package com.codemaster.tien.service.course;

import com.codemaster.tien.dto.request.CourseBasicRequestDTO;
import com.codemaster.tien.dto.request.CourseMediaRequestDTO;
import com.codemaster.tien.dto.response.CourseResponseDTO;

public interface CourseService {
    CourseResponseDTO createCourseBasic(CourseBasicRequestDTO courseBasicRequestDto);
    CourseResponseDTO updateCourseBasic(CourseBasicRequestDTO courseBasicRequestDto, Long courseId);
    CourseResponseDTO updateCourseMedia(CourseMediaRequestDTO courseMediaRequestDto, Long courseId);
}
