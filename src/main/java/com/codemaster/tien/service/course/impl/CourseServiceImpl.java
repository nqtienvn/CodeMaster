package com.codemaster.tien.service.course.impl;

import com.codemaster.tien.dto.request.CourseBasicRequestDTO;
import com.codemaster.tien.dto.request.CourseMediaRequestDTO;
import com.codemaster.tien.dto.response.CourseResponseDTO;
import com.codemaster.tien.entity.Course;
import com.codemaster.tien.repository.CourseRepository;
import com.codemaster.tien.service.course.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;
    @Override
    public CourseResponseDTO createCourseBasic(CourseBasicRequestDTO courseBasicRequestDto) {
        Course course = modelMapper.map(courseBasicRequestDto, Course.class);
        course.setCreatedAt(LocalDateTime.now());
        Course savedCourse = courseRepository.save(course);
        CourseResponseDTO courseResponseDto = modelMapper.map(savedCourse, CourseResponseDTO.class);
        courseResponseDto.setMessage("Course Basic Created");
        return courseResponseDto;
    }

    @Override
    public CourseResponseDTO updateCourseBasic(CourseBasicRequestDTO courseBasicRequestDto, Long courseId) {
        Course course = courseRepository.findCourseByCourseId(courseId);
        modelMapper.map(courseBasicRequestDto, course);
        course.setUpdatedAt(LocalDateTime.now());
        Course courseSaved = courseRepository.save(course);
        CourseResponseDTO courseResponseDto = modelMapper.map(courseSaved, CourseResponseDTO.class);
        courseResponseDto.setMessage("Course Basic Updated");
        return courseResponseDto;
    }

    @Override
    public CourseResponseDTO updateCourseMedia(CourseMediaRequestDTO courseMediaRequestDto, Long courseId) {
        Course course = courseRepository.findCourseByCourseId(courseId);
        modelMapper.map(courseMediaRequestDto, course);
        course.setUpdatedAt(LocalDateTime.now());
        Course courseSaved = courseRepository.save(course);
        CourseResponseDTO courseResponseDto = modelMapper.map(courseSaved, CourseResponseDTO.class);
        courseResponseDto.setMessage("Course Media Updated");
        return courseResponseDto;
    }

}
