package com.codeprism.lms.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeprism.lms.entity.Chapter;
import com.codeprism.lms.entity.Course;
import com.codeprism.lms.repository.ChapterRepository;
import com.codeprism.lms.repository.CourseRepository;
import com.codeprism.lms.service.ChapterSerivce;
import com.google.common.base.Optional;

@Service
public class ChapterServiceImpl implements ChapterSerivce {

	@Autowired
	private ChapterRepository chapterRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Transactional
	public Chapter insertChapter(Chapter chapter) {

		try {
			

			Optional<Course> course= courseRepository.findByCourseId(chapter.getCourseId());
			chapter.setCourse(course.get());
			
			if(course.get()==null) {
			   Exception exception=new Exception();
			   exception.getMessage();
			}
			
			} catch (Exception e) {

			System.err.println(e);
		}

		return chapterRepository.save(chapter);
	}

	@Override
	public Iterable<Chapter> getAll() {
		Iterable<Chapter> chapters = null;
		try {
			chapterRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return chapters;
	}

	@Override
	public Chapter updateChapter(Chapter chapter) {
		try {
			chapter = chapterRepository.save(chapter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chapter;
	}

	@Override
	public Integer delete(String id) {
		return null;
	}

	@Override
	public Chapter getById(String chapterId) {
		Chapter chapter = null;
		try {
			chapter = chapterRepository.getOne(chapterId);
			if (chapter != null) {
				System.out.println(" chapter data is avaiable");
			} else {
				System.out.println("no data chapter data is avlaible");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chapter;
	}

	@Transactional
	public void deleteAll() {

		try {
			chapterRepository.deleteAll();
			System.out.println("all couses data  delete sucessfully ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
