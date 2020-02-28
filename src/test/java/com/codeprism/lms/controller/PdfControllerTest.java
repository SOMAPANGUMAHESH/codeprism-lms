package com.codeprism.lms.controller;

import com.codeprism.lms.entity.PDF;
import com.codeprism.lms.service.PDFService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(PDFController.class)
 public class PdfControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PDFService pdfService;

    @Test
    public void  createPdf() throws Exception {
        PDF pdf=new PDF();
           pdf.setPdfId("Pd-1");
           pdf.setSecure(true);
           pdf.setUrl("htp://localhost:9898/api/pdf/savepdf");
            Mockito.when(pdfService.savePdf(pdf));

              RequestBuilder requestBuilder= MockMvcRequestBuilders.post("/api/pdf/savepdf")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result= mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response=result.getResponse();
        assertEquals(HttpStatus.CREATED.value(),response.getStatus());
        assertEquals("http://localhost:9976//api/pdf/savepdf",response.getHeader(HttpHeaders.LOCATION));


    }

 }
