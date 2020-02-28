package com.codeprism.lms.service;

import java.util.List;

import com.codeprism.lms.dto.CourseDto;
import com.codeprism.lms.entity.Course;

public interface CourseService {
	
	CourseDto insertCourse(Course course);

	List<CourseDto> getAllCourses();
	
	CourseDto getById(String courseId);

	CourseDto updateCourse(Course  course);

	void delete(String  courseId);
	
	void DeleteAll();

	
}
