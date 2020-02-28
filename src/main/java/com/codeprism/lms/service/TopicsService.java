package com.codeprism.lms.service;

import com.codeprism.lms.entity.Topics;

public interface TopicsService {

	Topics insertCourse(Topics topics);

	Iterable<Topics> getAll();
	
	Topics getById(String  topicId);

	Topics updateTopics(Topics topics);
	
	 void deleteAll();

	void delete(String id);

}
