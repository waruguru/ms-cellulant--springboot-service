package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class BillingServiceResponse {
    private long billingServiceID;
    private String serviceName;
    private long billerID;
    private Object billerSubdomain;
    private long billType;
    private String serviceDescription;
    private Object serviceLogoName;
    private String serviceLogoPath;
    private String serviceLink;
    private String serviceCode;
    private Object serviceID;
    private String countryCode;
    private String createOrigin;
    private BillingServiceConfig billingServiceConfig;
    private OffsetDateTime dateCreated;
    private OffsetDateTime dateModified;
    private long status;

    @JsonProperty("billingServiceID")
    public long getBillingServiceID() { return billingServiceID; }
    @JsonProperty("billingServiceID")
    public void setBillingServiceID(long value) { this.billingServiceID = value; }

    @JsonProperty("serviceName")
    public String getServiceName() { return serviceName; }
    @JsonProperty("serviceName")
    public void setServiceName(String value) { this.serviceName = value; }

    @JsonProperty("billerID")
    public long getBillerID() { return billerID; }
    @JsonProperty("billerID")
    public void setBillerID(long value) { this.billerID = value; }

    @JsonProperty("billerSubdomain")
    public Object getBillerSubdomain() { return billerSubdomain; }
    @JsonProperty("billerSubdomain")
    public void setBillerSubdomain(Object value) { this.billerSubdomain = value; }

    @JsonProperty("billType")
    public long getBillType() { return billType; }
    @JsonProperty("billType")
    public void setBillType(long value) { this.billType = value; }

    @JsonProperty("serviceDescription")
    public String getServiceDescription() { return serviceDescription; }
    @JsonProperty("serviceDescription")
    public void setServiceDescription(String value) { this.serviceDescription = value; }

    @JsonProperty("serviceLogoName")
    public Object getServiceLogoName() { return serviceLogoName; }
    @JsonProperty("serviceLogoName")
    public void setServiceLogoName(Object value) { this.serviceLogoName = value; }

    @JsonProperty("serviceLogoPath")
    public String getServiceLogoPath() { return serviceLogoPath; }
    @JsonProperty("serviceLogoPath")
    public void setServiceLogoPath(String value) { this.serviceLogoPath = value; }

    @JsonProperty("serviceLink")
    public String getServiceLink() { return serviceLink; }
    @JsonProperty("serviceLink")
    public void setServiceLink(String value) { this.serviceLink = value; }

    @JsonProperty("serviceCode")
    public String getServiceCode() { return serviceCode; }
    @JsonProperty("serviceCode")
    public void setServiceCode(String value) { this.serviceCode = value; }

    @JsonProperty("serviceID")
    public Object getServiceID() { return serviceID; }
    @JsonProperty("serviceID")
    public void setServiceID(Object value) { this.serviceID = value; }

    @JsonProperty("countryCode")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("countryCode")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("createOrigin")
    public String getCreateOrigin() { return createOrigin; }
    @JsonProperty("createOrigin")
    public void setCreateOrigin(String value) { this.createOrigin = value; }

    @JsonProperty("billingServiceConfig")
    public BillingServiceConfig getBillingServiceConfig() { return billingServiceConfig; }
    @JsonProperty("billingServiceConfig")
    public void setBillingServiceConfig(BillingServiceConfig value) { this.billingServiceConfig = value; }

    @JsonProperty("dateCreated")
    public OffsetDateTime getDateCreated() { return dateCreated; }
    @JsonProperty("dateCreated")
    public void setDateCreated(OffsetDateTime value) { this.dateCreated = value; }

    @JsonProperty("dateModified")
    public OffsetDateTime getDateModified() { return dateModified; }
    @JsonProperty("dateModified")
    public void setDateModified(OffsetDateTime value) { this.dateModified = value; }

    @JsonProperty("status")
    public long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(long value) { this.status = value; }
}
