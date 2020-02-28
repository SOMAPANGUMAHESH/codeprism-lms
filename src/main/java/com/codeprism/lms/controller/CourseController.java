package com.codeprism.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codeprism.lms.dto.CourseDto;
import com.codeprism.lms.entity.Course;
import com.codeprism.lms.service.CourseService;

@RestController()
@RequestMapping(value = "/api/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping(value = "/savecourse")
	public CourseDto insertCourses(@RequestBody Course course) {
		return courseService.insertCourse(course);
	}

	@GetMapping(value = "/getallcourses")
	public List<CourseDto> getAllCourses() {
		return courseService.getAllCourses();
	
	}
	
	@PutMapping(value = "/updatecourse")
	public CourseDto updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
		
	}
	
	
	@DeleteMapping(value = "/deletebyid/{courseId}")
	public void deleteCourseById(@PathVariable String courseId) {
	courseService.delete(courseId);
	}
	
	
}
