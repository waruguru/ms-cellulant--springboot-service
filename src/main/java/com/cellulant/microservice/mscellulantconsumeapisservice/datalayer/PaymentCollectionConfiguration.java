package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class PaymentCollectionConfiguration {
    private String api;

    @JsonProperty("api")
    public String getAPI() { return api; }
    @JsonProperty("api")
    public void setAPI(String value) { this.api = value; }
}
