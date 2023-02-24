package com.cellulant.microservice.mscellulantconsumeapisservice.service;


import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.BillingDetails;
import com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.requestdto.PostApiRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@AllArgsConstructor
public class TestService {

    private RestTemplate restTemplate;

    private ResponseEntity<BillingDetails> testGetApi(String billHash, String paymentChannel){
        String url =  "https://paybylink-apis.dev.tingg.africa/paybylink-apis?billHash" + billHash + "&paymentChannels"
                + paymentChannel;
        return restTemplate.exchange(
                UriComponentsBuilder.fromUriString(url).build().encode().toString(),
                HttpMethod.GET,
                new HttpEntity<>(null), BillingDetails.class
        );

    }
    private ResponseEntity<Object>testPostApi(BillingDetails billingDetails){


    PostApiRequestDto postApiRequestDto= PostApiRequestDto.builder()
             .originatorMSISDN(billingDetails.getBill().getMsisdn())
             .payerClientCode("SAFKE")
             .payerClientName("M-PESA")
            .checkoutType("USSD_PUSH")
            .countryCode(billingDetails.getBiller().getCountry())
            .requestOrigin("TINGG_SUBSCRIPTIONS_WEB")
            .msisdn(billingDetails.getBill().getMsisdn())
            .language("en")
            .accountNumber(billingDetails.getBill().getAccountNumber())
            .invoiceNumber("")
            .currencyCode(billingDetails.getBill().getCurrencyCode())
            .amount(billingDetails.getBill().getDueAmount())
            .description("Payment for a bill")
            .billingServiceID(billingDetails.getBillingServiceResponse().getBillingServiceID())
            .billHash(billingDetails.getBill().getBillID())
            .paymentChannel("paybill")
            .paymentCode("589036")
             .build();

      //should check on the response of get has expected response if yes proceed
        String url = "https://paybylink-apis.dev.tingg.africa/paybylink-apis/api/merchant/microsite/routing/charge";
        return restTemplate.exchange(
                UriComponentsBuilder.fromUriString(url).build().encode().toString(),
                HttpMethod.POST,
                new HttpEntity<>(postApiRequestDto,null), Object.class
        );
    }

    public ResponseEntity<Object> confirmGetPostApis(String billHash, String paymentChannel) {
        ResponseEntity<BillingDetails> billingDetails = testGetApi(billHash,paymentChannel);
        if (billingDetails.getStatusCode().is2xxSuccessful()){
           ResponseEntity<Object>  testPostApiResponse = testPostApi(billingDetails.getBody());
             if (testPostApiResponse.getStatusCode().is2xxSuccessful()){
                 return testPostApiResponse;
             }else {
                 return ResponseEntity.badRequest().body("Post Failed");
             }


        }else {
            return ResponseEntity.badRequest().body("Get Failed");
        }
    }


}
