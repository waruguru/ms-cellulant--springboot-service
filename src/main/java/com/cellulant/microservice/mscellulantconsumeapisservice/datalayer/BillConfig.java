package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class BillConfig {
    private List<Object> itemsConfiguration;
    private String paymentChannel;

    @JsonProperty("itemsConfiguration")
    public List<Object> getItemsConfiguration() { return itemsConfiguration; }
    @JsonProperty("itemsConfiguration")
    public void setItemsConfiguration(List<Object> value) { this.itemsConfiguration = value; }

    @JsonProperty("paymentChannel")
    public String getPaymentChannel() { return paymentChannel; }
    @JsonProperty("paymentChannel")
    public void setPaymentChannel(String value) { this.paymentChannel = value; }
}
