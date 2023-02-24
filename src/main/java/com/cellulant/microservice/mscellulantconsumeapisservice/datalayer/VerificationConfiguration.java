package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class VerificationConfiguration {
    private long unverifiedPaymentRequests;
    private long unverifiedChargeRequests;
    private long unverifiedCheckoutRequests;

    @JsonProperty("unverifiedPaymentRequests")
    public long getUnverifiedPaymentRequests() { return unverifiedPaymentRequests; }
    @JsonProperty("unverifiedPaymentRequests")
    public void setUnverifiedPaymentRequests(long value) { this.unverifiedPaymentRequests = value; }

    @JsonProperty("unverifiedChargeRequests")
    public long getUnverifiedChargeRequests() { return unverifiedChargeRequests; }
    @JsonProperty("unverifiedChargeRequests")
    public void setUnverifiedChargeRequests(long value) { this.unverifiedChargeRequests = value; }

    @JsonProperty("unverifiedCheckoutRequests")
    public long getUnverifiedCheckoutRequests() { return unverifiedCheckoutRequests; }
    @JsonProperty("unverifiedCheckoutRequests")
    public void setUnverifiedCheckoutRequests(long value) { this.unverifiedCheckoutRequests = value; }
}
