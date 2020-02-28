package com.codeprism.lms.service;

import com.codeprism.lms.entity.Chapter;

public interface ChapterSerivce {

	Chapter insertChapter(Chapter chapter);

	Iterable<Chapter> getAll();
	
	Chapter getById(String chapterId);

	Chapter updateChapter(Chapter  chapter);

	Integer delete(String chapterId);
	
	void  deleteAll();

}
