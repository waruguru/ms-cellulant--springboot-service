package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.requestdto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostApiRequestDto {
    private String originatorMSISDN;
    private String payerClientCode;
    private String payerClientName;
    private String checkoutType;
    private String countryCode;
    private String requestOrigin;
    private String msisdn;
    private String language;
    private String accountNumber;
    private String invoiceNumber;
    private String currencyCode;
    private long amount;
    private String description;
    private long billingServiceID;
    private long billHash;
    private String paymentChannel;
    private String paymentCode;

    @JsonProperty("originatorMSISDN")
    public String getOriginatorMSISDN() { return originatorMSISDN; }
    @JsonProperty("originatorMSISDN")
    public void setOriginatorMSISDN(String value) { this.originatorMSISDN = value; }

    @JsonProperty("payerClientCode")
    public String getPayerClientCode() { return payerClientCode; }
    @JsonProperty("payerClientCode")
    public void setPayerClientCode(String value) { this.payerClientCode = value; }

    @JsonProperty("payerClientName")
    public String getPayerClientName() { return payerClientName; }
    @JsonProperty("payerClientName")
    public void setPayerClientName(String value) { this.payerClientName = value; }

    @JsonProperty("checkoutType")
    public String getCheckoutType() { return checkoutType; }
    @JsonProperty("checkoutType")
    public void setCheckoutType(String value) { this.checkoutType = value; }

    @JsonProperty("countryCode")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("countryCode")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("requestOrigin")
    public String getRequestOrigin() { return requestOrigin; }
    @JsonProperty("requestOrigin")
    public void setRequestOrigin(String value) { this.requestOrigin = value; }

    @JsonProperty("msisdn")
    public String getMsisdn() { return msisdn; }
    @JsonProperty("msisdn")
    public void setMsisdn(String value) { this.msisdn = value; }

    @JsonProperty("language")
    public String getLanguage() { return language; }
    @JsonProperty("language")
    public void setLanguage(String value) { this.language = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() { return invoiceNumber; }
    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String value) { this.invoiceNumber = value; }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() { return currencyCode; }
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String value) { this.currencyCode = value; }

    @JsonProperty("amount")
    public long getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(long value) { this.amount = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("billingServiceID")
    public long getBillingServiceID() { return billingServiceID; }
    @JsonProperty("billingServiceID")
    public void setBillingServiceID(long value) { this.billingServiceID = value; }

    @JsonProperty("billHash")
    public long getBillHash() { return billHash; }
    @JsonProperty("billHash")
    public void setBillHash(long value) { this.billHash = value; }

    @JsonProperty("paymentChannel")
    public String getPaymentChannel() { return paymentChannel; }
    @JsonProperty("paymentChannel")
    public void setPaymentChannel(String value) { this.paymentChannel = value; }

    @JsonProperty("paymentCode")
    public String getPaymentCode() { return paymentCode; }
    @JsonProperty("paymentCode")
    public void setPaymentCode(String value) { this.paymentCode = value; }
}

