package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.responsedto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Header {
    private String requestRefId;
    private String responseCode;
    private String responseMessage;
    private String customerMessage=null;
    private String timestamp;
}
