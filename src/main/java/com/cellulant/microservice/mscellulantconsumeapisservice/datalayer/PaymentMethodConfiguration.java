package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class PaymentMethodConfiguration {
    private String payerClientCode;
    private String paymentCode;

    @JsonProperty("payerClientCode")
    public String getPayerClientCode() { return payerClientCode; }
    @JsonProperty("payerClientCode")
    public void setPayerClientCode(String value) { this.payerClientCode = value; }

    @JsonProperty("paymentCode")
    public String getPaymentCode() { return paymentCode; }
    @JsonProperty("paymentCode")
    public void setPaymentCode(String value) { this.paymentCode = value; }
}
