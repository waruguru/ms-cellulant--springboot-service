package com.cellulant.microservice.mscellulantconsumeapisservice.excepton;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomeException extends Throwable {
    private String statusCode;
    private String requestId;
    private String developerMessage;
    private String customerMessage;
}
