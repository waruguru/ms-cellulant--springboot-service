package com.cellulant.microservice.mscellulantconsumeapisservice.controller;
import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.BillingDetails;
import com.cellulant.microservice.mscellulantconsumeapisservice.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class MainControllerTest {
    @Mock
    TestService  testService;

    @InjectMocks
    private MainController mainController;

    @Captor
    ArgumentCaptor<String> hashMapCaptor;

    @Captor
    ArgumentCaptor<String> paymentChannelsCaptor;


    @Test
    public void testGetPostApiResponse(){
        BillingDetails billingDetails = new BillingDetails();
        when(testService.confirmGetPostApis(any(String.class),any(String.class))).thenReturn(ResponseEntity.ok(billingDetails));
        this.mainController.getPostApiResponse("test","test");
        verify(testService).confirmGetPostApis(hashMapCaptor.capture(),paymentChannelsCaptor.capture());
        Assertions.assertEquals("test",hashMapCaptor.getValue());
        Assertions.assertEquals("test",paymentChannelsCaptor.getValue());
    }

}