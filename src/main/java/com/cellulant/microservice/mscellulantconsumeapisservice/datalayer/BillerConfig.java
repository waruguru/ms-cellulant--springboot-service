package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class BillerConfig {
    private IpnConfiguration ipnConfiguration;
    private String language;
    private MicrositeConfiguration micrositeConfiguration;
    private PaymentCollectionConfiguration paymentCollectionConfiguration;
    private PaymentLinkConfiguration paymentLinkConfiguration;
    private PaymentMethodConfiguration paymentMethodConfiguration;
    private VerificationConfiguration verificationConfiguration;

    @JsonProperty("ipnConfiguration")
    public IpnConfiguration getIpnConfiguration() { return ipnConfiguration; }
    @JsonProperty("ipnConfiguration")
    public void setIpnConfiguration(IpnConfiguration value) { this.ipnConfiguration = value; }

    @JsonProperty("language")
    public String getLanguage() { return language; }
    @JsonProperty("language")
    public void setLanguage(String value) { this.language = value; }

    @JsonProperty("micrositeConfiguration")
    public MicrositeConfiguration getMicrositeConfiguration() { return micrositeConfiguration; }
    @JsonProperty("micrositeConfiguration")
    public void setMicrositeConfiguration(MicrositeConfiguration value) { this.micrositeConfiguration = value; }

    @JsonProperty("paymentCollectionConfiguration")
    public PaymentCollectionConfiguration getPaymentCollectionConfiguration() { return paymentCollectionConfiguration; }
    @JsonProperty("paymentCollectionConfiguration")
    public void setPaymentCollectionConfiguration(PaymentCollectionConfiguration value) { this.paymentCollectionConfiguration = value; }

    @JsonProperty("paymentLinkConfiguration")
    public PaymentLinkConfiguration getPaymentLinkConfiguration() { return paymentLinkConfiguration; }
    @JsonProperty("paymentLinkConfiguration")
    public void setPaymentLinkConfiguration(PaymentLinkConfiguration value) { this.paymentLinkConfiguration = value; }

    @JsonProperty("paymentMethodConfiguration")
    public PaymentMethodConfiguration getPaymentMethodConfiguration() { return paymentMethodConfiguration; }
    @JsonProperty("paymentMethodConfiguration")
    public void setPaymentMethodConfiguration(PaymentMethodConfiguration value) { this.paymentMethodConfiguration = value; }

    @JsonProperty("verificationConfiguration")
    public VerificationConfiguration getVerificationConfiguration() { return verificationConfiguration; }
    @JsonProperty("verificationConfiguration")
    public void setVerificationConfiguration(VerificationConfiguration value) { this.verificationConfiguration = value; }
}
