package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class Biller {
    private long billerID;
    private String clientCode;
    private String billerName;
    private String country;
    private String subdomain;
    private BillerConfig billerConfig;
    private String billerDescription;
    private String businessLogoPath;
    private String businessLogoName;
    private String email;
    private String phone;
    private SocialMedia socialMedia;
    private String roleID;
    private String createOrigin;
    private OffsetDateTime dateCreated;
    private OffsetDateTime dateModified;
    private long status;
    private long billerStatus;

    @JsonProperty("billerID")
    public long getBillerID() { return billerID; }
    @JsonProperty("billerID")
    public void setBillerID(long value) { this.billerID = value; }

    @JsonProperty("clientCode")
    public String getClientCode() { return clientCode; }
    @JsonProperty("clientCode")
    public void setClientCode(String value) { this.clientCode = value; }

    @JsonProperty("billerName")
    public String getBillerName() { return billerName; }
    @JsonProperty("billerName")
    public void setBillerName(String value) { this.billerName = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    @JsonProperty("subdomain")
    public String getSubdomain() { return subdomain; }
    @JsonProperty("subdomain")
    public void setSubdomain(String value) { this.subdomain = value; }

    @JsonProperty("billerConfig")
    public BillerConfig getBillerConfig() { return billerConfig; }
    @JsonProperty("billerConfig")
    public void setBillerConfig(BillerConfig value) { this.billerConfig = value; }

    @JsonProperty("billerDescription")
    public String getBillerDescription() { return billerDescription; }
    @JsonProperty("billerDescription")
    public void setBillerDescription(String value) { this.billerDescription = value; }

    @JsonProperty("businessLogoPath")
    public String getBusinessLogoPath() { return businessLogoPath; }
    @JsonProperty("businessLogoPath")
    public void setBusinessLogoPath(String value) { this.businessLogoPath = value; }

    @JsonProperty("businessLogoName")
    public String getBusinessLogoName() { return businessLogoName; }
    @JsonProperty("businessLogoName")
    public void setBusinessLogoName(String value) { this.businessLogoName = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("phone")
    public String getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(String value) { this.phone = value; }

    @JsonProperty("socialMedia")
    public SocialMedia getSocialMedia() { return socialMedia; }
    @JsonProperty("socialMedia")
    public void setSocialMedia(SocialMedia value) { this.socialMedia = value; }

    @JsonProperty("roleID")
    public String getRoleID() { return roleID; }
    @JsonProperty("roleID")
    public void setRoleID(String value) { this.roleID = value; }

    @JsonProperty("createOrigin")
    public String getCreateOrigin() { return createOrigin; }
    @JsonProperty("createOrigin")
    public void setCreateOrigin(String value) { this.createOrigin = value; }

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

    @JsonProperty("billerStatus")
    public long getBillerStatus() { return billerStatus; }
    @JsonProperty("billerStatus")
    public void setBillerStatus(long value) { this.billerStatus = value; }
}
