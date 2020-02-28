package com.codeprism.lms.service;

import java.util.List;

import com.codeprism.lms.dto.PDFDto;
import com.codeprism.lms.entity.PDF;

public interface PDFService {
	PDFDto savePdf(PDF pdf);

	List<PDFDto> getPdf();

	PDFDto getOnePdf(String pdfId);


	PDFDto updatePdf(PDF pdf);

	void deleteAllPdf();

	void deleteOnePdf(String pdfId);
}
