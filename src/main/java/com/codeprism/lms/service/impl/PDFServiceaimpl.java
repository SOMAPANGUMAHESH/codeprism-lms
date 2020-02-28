package com.codeprism.lms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeprism.lms.dto.PDFDto;
import com.codeprism.lms.entity.PDF;
import com.codeprism.lms.repository.PDFRepository;
import com.codeprism.lms.service.PDFService;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class PDFServiceaimpl implements PDFService {

	@Autowired
	private PDFRepository pdfRepository;

	@Override
	public PDFDto savePdf(PDF pdf) {
		PDFDto pdfDto = null;
		pdf = pdfRepository.save(pdf);
		if (pdf != null) {
			pdfDto = new PDFDto();
			BeanUtils.copyProperties(pdf, pdfDto);
		} else {
			System.out.println("null data not accepted");
		}
		return pdfDto;
	}

	@Override
	public List<PDFDto> getPdf() {
		List<PDF> pdfList = (List<PDF>) pdfRepository.findAll();
		List<PDFDto> pdfDtoList = new ArrayList<PDFDto>();
		for (PDF pdf : pdfList) {
			PDFDto pdfDto = new PDFDto();
			BeanUtils.copyProperties(pdf, pdfDto);
			pdfDtoList.add(pdfDto);
		}
		return pdfDtoList;
	}

	@Transactional
	public PDFDto getOnePdf(String pdfId) {
		PDFDto pdfDto =null;
		Optional<PDF> pdf =pdfRepository.findById(pdfId);
		if(pdf==null){
			System.out.println("service layer get not get the data");
		}else{
			pdfDto = new PDFDto();
			BeanUtils.copyProperties(pdf, pdfDto);

		}

		return pdfDto;
	}

	@Override
	public PDFDto updatePdf(PDF pdf) {
		pdf = pdfRepository.save(pdf);
		PDFDto pdfDto = new PDFDto();
		BeanUtils.copyProperties(pdf, pdfDto);
		return pdfDto;
	}

	@Override
	public void deleteAllPdf() {
		pdfRepository.deleteAll();
	}

	@Override
	public void deleteOnePdf(String pdfId) {
		pdfRepository.deleteById(pdfId);
	}

}
