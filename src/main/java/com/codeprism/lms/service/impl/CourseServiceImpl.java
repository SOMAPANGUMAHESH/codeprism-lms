package com.codeprism.lms.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeprism.lms.dto.CourseDto;
import com.codeprism.lms.entity.Course;
import com.codeprism.lms.repository.CourseRepository;
import com.codeprism.lms.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	
	public CourseDto insertCourse(Course course) {
		CourseDto courseDto = null;
		try {
			course = courseRepository.save(course);      
		    
			if (course != null) {
				courseDto = new CourseDto();
				BeanUtils.copyProperties(course, courseDto);
			}else {
				System.out.println("null data canot accepted");
			}

		} catch (Exception e) {
			System.err.println(e);
		}

		return courseDto;

	}

	public List<CourseDto> getAllCourses() {
		List<Course> courseList = courseRepository.findAll();
		List<CourseDto> dtoList = new ArrayList<CourseDto>();
		for (Course course : courseList) {
			CourseDto courseDto = new CourseDto();
			BeanUtils.copyProperties(course, courseDto);
			dtoList.add(courseDto);
			}
		return dtoList;
	}

	@Transactional
	public CourseDto getById(String courseId) {
		   Course course=courseRepository.getOne(courseId);
	CourseDto courseDto=new CourseDto(); 
	BeanUtils.copyProperties(course	,courseDto);
	return courseDto;
	}

	@Transactional
	public CourseDto  updateCourse(Course course) {
		course=courseRepository.save(course);
	      CourseDto courseDto=new CourseDto();
	     BeanUtils.copyProperties(course ,courseDto);
	      return courseDto;
	}
	

	@Transactional
	public void delete(String courseId) {
		courseRepository.deleteById(courseId);
	}

	@Transactional
	public void DeleteAll() {
		courseRepository.deleteAll();
	}

}
