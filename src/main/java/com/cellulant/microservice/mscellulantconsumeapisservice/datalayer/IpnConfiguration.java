package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class IpnConfiguration {
    private String url;
    private String protocol;
    private String httpMethod;
    private String contentType;
    private String basicAuthUsername;
    private String basicAuthPassword;

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }

    @JsonProperty("httpMethod")
    public String getHTTPMethod() { return httpMethod; }
    @JsonProperty("httpMethod")
    public void setHTTPMethod(String value) { this.httpMethod = value; }

    @JsonProperty("contentType")
    public String getContentType() { return contentType; }
    @JsonProperty("contentType")
    public void setContentType(String value) { this.contentType = value; }

    @JsonProperty("basicAuthUsername")
    public String getBasicAuthUsername() { return basicAuthUsername; }
    @JsonProperty("basicAuthUsername")
    public void setBasicAuthUsername(String value) { this.basicAuthUsername = value; }

    @JsonProperty("basicAuthPassword")
    public String getBasicAuthPassword() { return basicAuthPassword; }
    @JsonProperty("basicAuthPassword")
    public void setBasicAuthPassword(String value) { this.basicAuthPassword = value; }
}
