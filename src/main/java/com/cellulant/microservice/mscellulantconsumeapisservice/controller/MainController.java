package com.cellulant.microservice.mscellulantconsumeapisservice.controller;



import com.cellulant.microservice.mscellulantconsumeapisservice.service.TestService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/test")
@AllArgsConstructor
public class MainController {
    private TestService testService;
    @GetMapping( "/getApiResponse")
    public ResponseEntity<?> getPostApiResponse(@RequestParam String billHash, @RequestParam String paymentChannel){


        return testService.confirmGetPostApis(billHash,paymentChannel);
    }






}
