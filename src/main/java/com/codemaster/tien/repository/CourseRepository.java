package com.codemaster.tien.repository;

import com.codemaster.tien.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findCourseByCourseId(Long courseId);
}
