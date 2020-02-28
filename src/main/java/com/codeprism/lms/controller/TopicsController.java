package com.codeprism.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeprism.lms.entity.Topics;
import com.codeprism.lms.service.TopicsService;

@RestController
@RequestMapping(value = "topics")
public class TopicsController {

	@Autowired
	private TopicsService topicsService;

	@PostMapping(value = "/insertTopic")
	public Topics insertTopics(@RequestBody Topics topics) {
		return topicsService.insertCourse(topics);

	}

	@GetMapping(value = "/getalltopics")
	public Iterable<Topics> getAllTopics(){
		return topicsService.getAll();
	}

	@PutMapping(value = "/updateTopics")
	public  Topics updateTopics(@RequestBody Topics topics) {
		return topicsService.updateTopics(topics);
	}
	@DeleteMapping(value = "/deletetopicsbyid/{topicsId}")
	public void deleteTopicById(@PathVariable String topicsId) {
		topicsService.delete(topicsId);
		
		
	}
	
	}

