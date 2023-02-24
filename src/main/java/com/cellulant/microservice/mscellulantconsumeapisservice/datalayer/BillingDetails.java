package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class BillingDetails {
    private Biller biller;
    private BillingServiceResponse billingServiceResponse;
    private Bill bill;
    private Object expiryDate;
    private boolean expired;

    @JsonProperty("biller")
    public Biller getBiller() { return biller; }
    @JsonProperty("biller")
    public void setBiller(Biller value) { this.biller = value; }

    @JsonProperty("billingServiceResponse")
    public BillingServiceResponse getBillingServiceResponse() { return billingServiceResponse; }
    @JsonProperty("billingServiceResponse")
    public void setBillingServiceResponse(BillingServiceResponse value) { this.billingServiceResponse = value; }

    @JsonProperty("bill")
    public Bill getBill() { return bill; }
    @JsonProperty("bill")
    public void setBill(Bill value) { this.bill = value; }

    @JsonProperty("expiryDate")
    public Object getExpiryDate() { return expiryDate; }
    @JsonProperty("expiryDate")
    public void setExpiryDate(Object value) { this.expiryDate = value; }

    @JsonProperty("expired")
    public boolean getExpired() { return expired; }
    @JsonProperty("expired")
    public void setExpired(boolean value) { this.expired = value; }
}
