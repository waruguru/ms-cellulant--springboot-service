package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import com.fasterxml.jackson.annotation.*;

public class MicrositeConfiguration {
    private long isAmountEditable;
    private String welcomeMsg;
    private String label1;
    private String placeholder1;
    private String label2;
    private String placeholder2;
    private String label3;
    private String placeholder3;
    private String welcomeMsgSw;
    private String label1Sw;
    private String placeholder1Sw;
    private String label2Sw;
    private String placeholder2Sw;
    private String label3Sw;
    private String placeholder3Sw;
    private String welcomeMsgFr;
    private String label1Fr;
    private String placeholder1Fr;
    private String label2Fr;
    private String placeholder2Fr;
    private String label3Fr;
    private String placeholder3Fr;

    @JsonProperty("isAmountEditable")
    public long getIsAmountEditable() { return isAmountEditable; }
    @JsonProperty("isAmountEditable")
    public void setIsAmountEditable(long value) { this.isAmountEditable = value; }

    @JsonProperty("welcomeMsg")
    public String getWelcomeMsg() { return welcomeMsg; }
    @JsonProperty("welcomeMsg")
    public void setWelcomeMsg(String value) { this.welcomeMsg = value; }

    @JsonProperty("label1")
    public String getLabel1() { return label1; }
    @JsonProperty("label1")
    public void setLabel1(String value) { this.label1 = value; }

    @JsonProperty("placeholder1")
    public String getPlaceholder1() { return placeholder1; }
    @JsonProperty("placeholder1")
    public void setPlaceholder1(String value) { this.placeholder1 = value; }

    @JsonProperty("label2")
    public String getLabel2() { return label2; }
    @JsonProperty("label2")
    public void setLabel2(String value) { this.label2 = value; }

    @JsonProperty("placeholder2")
    public String getPlaceholder2() { return placeholder2; }
    @JsonProperty("placeholder2")
    public void setPlaceholder2(String value) { this.placeholder2 = value; }

    @JsonProperty("label3")
    public String getLabel3() { return label3; }
    @JsonProperty("label3")
    public void setLabel3(String value) { this.label3 = value; }

    @JsonProperty("placeholder3")
    public String getPlaceholder3() { return placeholder3; }
    @JsonProperty("placeholder3")
    public void setPlaceholder3(String value) { this.placeholder3 = value; }

    @JsonProperty("welcomeMsg-sw")
    public String getWelcomeMsgSw() { return welcomeMsgSw; }
    @JsonProperty("welcomeMsg-sw")
    public void setWelcomeMsgSw(String value) { this.welcomeMsgSw = value; }

    @JsonProperty("label1-sw")
    public String getLabel1Sw() { return label1Sw; }
    @JsonProperty("label1-sw")
    public void setLabel1Sw(String value) { this.label1Sw = value; }

    @JsonProperty("placeholder1-sw")
    public String getPlaceholder1Sw() { return placeholder1Sw; }
    @JsonProperty("placeholder1-sw")
    public void setPlaceholder1Sw(String value) { this.placeholder1Sw = value; }

    @JsonProperty("label2-sw")
    public String getLabel2Sw() { return label2Sw; }
    @JsonProperty("label2-sw")
    public void setLabel2Sw(String value) { this.label2Sw = value; }

    @JsonProperty("placeholder2-sw")
    public String getPlaceholder2Sw() { return placeholder2Sw; }
    @JsonProperty("placeholder2-sw")
    public void setPlaceholder2Sw(String value) { this.placeholder2Sw = value; }

    @JsonProperty("label3-sw")
    public String getLabel3Sw() { return label3Sw; }
    @JsonProperty("label3-sw")
    public void setLabel3Sw(String value) { this.label3Sw = value; }

    @JsonProperty("placeholder3-sw")
    public String getPlaceholder3Sw() { return placeholder3Sw; }
    @JsonProperty("placeholder3-sw")
    public void setPlaceholder3Sw(String value) { this.placeholder3Sw = value; }

    @JsonProperty("welcomeMsg-fr")
    public String getWelcomeMsgFr() { return welcomeMsgFr; }
    @JsonProperty("welcomeMsg-fr")
    public void setWelcomeMsgFr(String value) { this.welcomeMsgFr = value; }

    @JsonProperty("label1-fr")
    public String getLabel1Fr() { return label1Fr; }
    @JsonProperty("label1-fr")
    public void setLabel1Fr(String value) { this.label1Fr = value; }

    @JsonProperty("placeholder1-fr")
    public String getPlaceholder1Fr() { return placeholder1Fr; }
    @JsonProperty("placeholder1-fr")
    public void setPlaceholder1Fr(String value) { this.placeholder1Fr = value; }

    @JsonProperty("label2-fr")
    public String getLabel2Fr() { return label2Fr; }
    @JsonProperty("label2-fr")
    public void setLabel2Fr(String value) { this.label2Fr = value; }

    @JsonProperty("placeholder2-fr")
    public String getPlaceholder2Fr() { return placeholder2Fr; }
    @JsonProperty("placeholder2-fr")
    public void setPlaceholder2Fr(String value) { this.placeholder2Fr = value; }

    @JsonProperty("label3-fr")
    public String getLabel3Fr() { return label3Fr; }
    @JsonProperty("label3-fr")
    public void setLabel3Fr(String value) { this.label3Fr = value; }

    @JsonProperty("placeholder3-fr")
    public String getPlaceholder3Fr() { return placeholder3Fr; }
    @JsonProperty("placeholder3-fr")
    public void setPlaceholder3Fr(String value) { this.placeholder3Fr = value; }
}
