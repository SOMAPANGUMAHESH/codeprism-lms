package com.codeprism.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeprism.lms.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, String> {



}
