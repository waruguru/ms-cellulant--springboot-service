package com.cellulant.microservice.mscellulantconsumeapisservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class ConfigProperties {
    private String baseUrl;
    private String getApiUrl;
    private String postApiUrl;
    private String applicationName;
    private String appVersion = "0.0.1";
}
