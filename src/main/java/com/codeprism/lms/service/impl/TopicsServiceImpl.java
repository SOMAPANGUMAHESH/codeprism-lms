package com.codeprism.lms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeprism.lms.entity.Topics;
import com.codeprism.lms.repository.TopicsRepository;
import com.codeprism.lms.service.TopicsService;

@Service
public class TopicsServiceImpl implements TopicsService {

	@Autowired
	private TopicsRepository topicsRepository;

	@Override
	public Topics insertCourse(Topics topics) {
		return topicsRepository.save(topics);
	}

	@Override
	public Iterable<Topics> getAll() {
		return topicsRepository.findAll();
	}

	@Override
	public Topics getById(String topicId) {
		return topicsRepository.getOne(topicId);
	}

	@Override
	public Topics updateTopics(Topics topics) {
		return topicsRepository.save(topics);
	}

	
	@Override
	public void deleteAll() {
		topicsRepository.deleteAll();
	}

	@Override
	public void delete(String chapterId) {
		topicsRepository.deleteById(chapterId);
	}
}
