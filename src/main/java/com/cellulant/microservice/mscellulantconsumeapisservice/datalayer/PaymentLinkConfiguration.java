package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class PaymentLinkConfiguration {
    private String expires;
    private String paymentChannel;

    @JsonProperty("expires")
    public String getExpires() { return expires; }
    @JsonProperty("expires")
    public void setExpires(String value) { this.expires = value; }

    @JsonProperty("paymentChannel")
    public String getPaymentChannel() { return paymentChannel; }
    @JsonProperty("paymentChannel")
    public void setPaymentChannel(String value) { this.paymentChannel = value; }
}
