package com.cellulant.microservice.mscellulantconsumeapisservice.controller;

import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.BillingDetails;
import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.TestPojo;
import com.cellulant.microservice.mscellulantconsumeapisservice.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.swing.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
@AutoConfigureMockMvc
public class MainControllerMvcTest {

    @Autowired
    MainController mainController;


    @MockBean
    TestService testService;

    @Autowired
    private MockMvc mvc;


    @Test
    public void testGetPostApiEndpoint() throws Exception {
        BillingDetails testPojo = new BillingDetails();
        when(testService.confirmGetPostApis(any(String.class), any(String.class))).thenReturn(ResponseEntity.ok(testPojo));
        mvc.perform(get("/api/v1/test/getApiResponse")
                .param("billHash","test").param("paymentChannel","test")).andExpect(status().isOk());
    }
}
