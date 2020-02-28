package com.codeprism.lms.controller;

import com.codeprism.lms.dto.PDFDto;
import com.codeprism.lms.entity.PDF;
import com.codeprism.lms.service.PDFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pdf")
public class PDFController {
    @Autowired
    private PDFService pdfService;

    @PostMapping(value = "/savepdf")
    public PDFDto insertpdf(@RequestBody PDF pdf) {
        PDFDto pdfDto = pdfService.savePdf(pdf);
        return pdfDto;
    }

    @GetMapping(value = "/getpdf")
    public List<PDFDto> getAllPdf() {
        return pdfService.getPdf();
    }

    @GetMapping(value = "/getonepdf/{pdfId}")
    public PDFDto getOnePdf(@PathVariable String pdfId) {
        PDFDto pdfDto = pdfService.getOnePdf(pdfId);
        return pdfDto;
    }

    @PutMapping(value = "updatePdf")
    public PDFDto updatePdf(@RequestBody PDF pdf) {
        return pdfService.updatePdf(pdf);
    }

    @DeleteMapping(value = "/deletepdf")
    public void deleteAllPdf() {
        pdfService.deleteAllPdf();
    }

    @DeleteMapping(value = "/deleteonepdf/{pdfId}")
    public void deleteOnepdf(@PathVariable String pdfId) {
        pdfService.deleteOnePdf(pdfId);
    }
}
