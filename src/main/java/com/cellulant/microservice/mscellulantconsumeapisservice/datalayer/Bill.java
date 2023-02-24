package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Bill {
    private long billID;
    private long billingServiceID;
    private UUID uniqueHash;
    private String accountNumber;
    private String accountName;
    private long dueAmount;
    private long isAmountEditable;
    private long paidAmount;
    private String deliveryChannel;
    private String email;
    private Object billFileID;
    private String currencyCode;
    private OffsetDateTime dueDate;
    private long sendStatus;
    private long paymentStatus;
    private String countryCode;
    private Object billCycleID;
    private OffsetDateTime dateCreated;
    private BillConfig billConfig;
    private String requestOrigin;
    private OffsetDateTime dateModified;
    private long status;
    private String msisdn;

    @JsonProperty("billID")
    public long getBillID() { return billID; }
    @JsonProperty("billID")
    public void setBillID(long value) { this.billID = value; }

    @JsonProperty("billingServiceID")
    public long getBillingServiceID() { return billingServiceID; }
    @JsonProperty("billingServiceID")
    public void setBillingServiceID(long value) { this.billingServiceID = value; }

    @JsonProperty("uniqueHash")
    public UUID getUniqueHash() { return uniqueHash; }
    @JsonProperty("uniqueHash")
    public void setUniqueHash(UUID value) { this.uniqueHash = value; }

    @JsonProperty("accountNumber")
    public String getAccountNumber() { return accountNumber; }
    @JsonProperty("accountNumber")
    public void setAccountNumber(String value) { this.accountNumber = value; }

    @JsonProperty("accountName")
    public String getAccountName() { return accountName; }
    @JsonProperty("accountName")
    public void setAccountName(String value) { this.accountName = value; }

    @JsonProperty("dueAmount")
    public long getDueAmount() { return dueAmount; }
    @JsonProperty("dueAmount")
    public void setDueAmount(long value) { this.dueAmount = value; }

    @JsonProperty("isAmountEditable")
    public long getIsAmountEditable() { return isAmountEditable; }
    @JsonProperty("isAmountEditable")
    public void setIsAmountEditable(long value) { this.isAmountEditable = value; }

    @JsonProperty("paidAmount")
    public long getPaidAmount() { return paidAmount; }
    @JsonProperty("paidAmount")
    public void setPaidAmount(long value) { this.paidAmount = value; }

    @JsonProperty("deliveryChannel")
    public String getDeliveryChannel() { return deliveryChannel; }
    @JsonProperty("deliveryChannel")
    public void setDeliveryChannel(String value) { this.deliveryChannel = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("billFileID")
    public Object getBillFileID() { return billFileID; }
    @JsonProperty("billFileID")
    public void setBillFileID(Object value) { this.billFileID = value; }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() { return currencyCode; }
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String value) { this.currencyCode = value; }

    @JsonProperty("dueDate")
    public OffsetDateTime getDueDate() { return dueDate; }
    @JsonProperty("dueDate")
    public void setDueDate(OffsetDateTime value) { this.dueDate = value; }

    @JsonProperty("sendStatus")
    public long getSendStatus() { return sendStatus; }
    @JsonProperty("sendStatus")
    public void setSendStatus(long value) { this.sendStatus = value; }

    @JsonProperty("paymentStatus")
    public long getPaymentStatus() { return paymentStatus; }
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(long value) { this.paymentStatus = value; }

    @JsonProperty("countryCode")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("countryCode")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("billCycleID")
    public Object getBillCycleID() { return billCycleID; }
    @JsonProperty("billCycleID")
    public void setBillCycleID(Object value) { this.billCycleID = value; }

    @JsonProperty("dateCreated")
    public OffsetDateTime getDateCreated() { return dateCreated; }
    @JsonProperty("dateCreated")
    public void setDateCreated(OffsetDateTime value) { this.dateCreated = value; }

    @JsonProperty("billConfig")
    public BillConfig getBillConfig() { return billConfig; }
    @JsonProperty("billConfig")
    public void setBillConfig(BillConfig value) { this.billConfig = value; }

    @JsonProperty("requestOrigin")
    public String getRequestOrigin() { return requestOrigin; }
    @JsonProperty("requestOrigin")
    public void setRequestOrigin(String value) { this.requestOrigin = value; }

    @JsonProperty("dateModified")
    public OffsetDateTime getDateModified() { return dateModified; }
    @JsonProperty("dateModified")
    public void setDateModified(OffsetDateTime value) { this.dateModified = value; }

    @JsonProperty("status")
    public long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(long value) { this.status = value; }

    @JsonProperty("msisdn")
    public String getMsisdn() { return msisdn; }
    @JsonProperty("msisdn")
    public void setMsisdn(String value) { this.msisdn = value; }
}
