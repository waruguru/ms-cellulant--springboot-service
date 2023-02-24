package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class SocialMedia {
    private String facebook;
    private String instagram;
    private String twitter;
    private String whatsapp;

    @JsonProperty("facebook")
    public String getFacebook() { return facebook; }
    @JsonProperty("facebook")
    public void setFacebook(String value) { this.facebook = value; }

    @JsonProperty("instagram")
    public String getInstagram() { return instagram; }
    @JsonProperty("instagram")
    public void setInstagram(String value) { this.instagram = value; }

    @JsonProperty("twitter")
    public String getTwitter() { return twitter; }
    @JsonProperty("twitter")
    public void setTwitter(String value) { this.twitter = value; }

    @JsonProperty("whatsapp")
    public String getWhatsapp() { return whatsapp; }
    @JsonProperty("whatsapp")
    public void setWhatsapp(String value) { this.whatsapp = value; }
}
