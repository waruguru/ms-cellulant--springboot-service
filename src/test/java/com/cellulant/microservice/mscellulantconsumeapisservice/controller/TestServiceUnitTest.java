package com.cellulant.microservice.mscellulantconsumeapisservice.controller;

import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.BillingDetails;
import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.TestPojo;
import com.cellulant.microservice.mscellulantconsumeapisservice.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TestServiceUnitTest {


    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    TestService testService;

    @Captor
    ArgumentCaptor<String> urlCaptor;


    @Test
    public  void testTestGetApi(){
     String billHash= "test";
     String paymentChannel= "test";
        String getUrl =  "https://paybylink-apis.dev.tingg.africa/paybylink-apis?billHash" + billHash + "&paymentChannels"
                + paymentChannel;
        String postUrl= "https://paybylink-apis.dev.tingg.africa/paybylink-apis/api/merchant/microsite/routing/charge";
        when(restTemplate.exchange(any(String.class), eq( HttpMethod.GET), any(HttpEntity.class),
               Mockito.<Class<BillingDetails>> any())).thenReturn(ResponseEntity.ok(new BillingDetails()));
        when(restTemplate.exchange(any(String.class), eq( HttpMethod.POST), any(HttpEntity.class),
                Mockito.<Class<Object>> any())).thenReturn(ResponseEntity.ok(new Object()));
        testService.confirmGetPostApis(billHash,paymentChannel);
        verify(restTemplate).exchange(urlCaptor.capture(), eq( HttpMethod.GET), any(HttpEntity.class),
                Mockito.<Class<BillingDetails>> any());
        verify(restTemplate).exchange(urlCaptor.capture(), eq( HttpMethod.POST), any(HttpEntity.class),
                Mockito.<Class<BillingDetails>> any());
        String capturedUrl = urlCaptor.getAllValues().get(0);
        String capturedPostUrl = urlCaptor.getAllValues().get(1);
        Assertions.assertEquals(getUrl,capturedUrl);
        Assertions.assertEquals(postUrl,capturedPostUrl);
    }

}
