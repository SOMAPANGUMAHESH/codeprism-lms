package com.codeprism.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeprism.lms.entity.PDF;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PDFRepository extends JpaRepository<PDF,String > {

//   Optional<PDF> findBypdf(String PdfId);
}

