package com.codemaster.tien.controller;

import com.codemaster.tien.dto.request.CourseBasicRequestDTO;
import com.codemaster.tien.dto.request.CourseMediaRequestDTO;
import com.codemaster.tien.dto.response.CourseResponseDTO;
import com.codemaster.tien.service.course.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class CourseController {
    private final ModelMapper modelMapper;
    private final CourseService courseService;
    //create step 1 cua create course, not update
    @PostMapping(value = "/course/basic", produces = "application/json")
    public ResponseEntity<CourseResponseDTO> saveBasicInfor(@RequestBody CourseBasicRequestDTO courseBasicRequestDto) {
       return ResponseEntity.ok(courseService.createCourseBasic(courseBasicRequestDto));
    }
    //Update Course Basic
    @PutMapping(value = "/course/basic/{courseId}", produces = "application/json")
    public ResponseEntity<CourseResponseDTO> updateBasicInfor(@RequestBody CourseBasicRequestDTO courseBasicRequestDto,
                                                              @PathVariable("courseId") Long courseId) {
        return ResponseEntity.ok(courseService.updateCourseBasic(courseBasicRequestDto, courseId));
    }
    @PutMapping(value = "/course/media/{courseId}", produces = "application/json")
    public ResponseEntity<CourseResponseDTO> updateMediaInfor(@RequestBody CourseMediaRequestDTO courseMediaRequestDto,
                                                              @PathVariable(value = "courseId", required = false) Long courseId) {
        return ResponseEntity.ok(courseService.updateCourseMedia(courseMediaRequestDto, courseId));
    }

}
