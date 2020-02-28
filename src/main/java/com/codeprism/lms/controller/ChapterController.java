package com.codeprism.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeprism.lms.entity.Chapter;
import com.codeprism.lms.service.ChapterSerivce;

@RestController
public class ChapterController {
   @Autowired
   private ChapterSerivce chapterService;
	
	
	@PostMapping(value = "/insertchapter")
	public Chapter insertchapter(@RequestBody Chapter chapter) {
		return chapterService.insertChapter(chapter);
	}

	@GetMapping(value = "/getallchapters")
	public Iterable<Chapter> getAllChapter() {
		return chapterService.getAll();
	
	}
	
	@PutMapping(value = "/updatechapter")
	public Chapter updateChapter(@RequestBody Chapter chapter) {
		return chapterService.updateChapter(chapter);
		
	}
	
	
	@DeleteMapping(value = "/deletebytd/{chapterId}")
	public void deleteChapterById(@PathVariable String chapterId) {
		chapterService.delete(chapterId);
	}
}
