package com.codeprism.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeprism.lms.entity.Topics;

public interface TopicsRepository extends JpaRepository<Topics, String>{

}
