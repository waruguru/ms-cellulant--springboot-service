package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    public Header header;
    public Object body;
}

