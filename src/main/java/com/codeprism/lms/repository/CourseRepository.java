package com.codeprism.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeprism.lms.entity.Course;
import com.google.common.base.Optional;

public interface CourseRepository extends JpaRepository<Course, String>{

	Optional<Course>  findByCourseId(String courseId);
	
	
	
}
