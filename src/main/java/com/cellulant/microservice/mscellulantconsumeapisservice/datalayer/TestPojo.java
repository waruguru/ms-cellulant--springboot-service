package com.cellulant.microservice.mscellulantconsumeapisservice.datalayer;

import lombok.Data;


@Data
public class TestPojo {
    private Originator originatorMSISDN;
    private String payerClientCode;
    private String payerClientName;
    private String checkoutType;
    private CountryCode countryCode;
    private String requestOrigin;
    private Msisdn msisdn;
    private String language;
    private AccountNumber accountNumber;
    private String invoiceNumber;
    private CurrencyCode currencyCode;
    private Amount amount;
    private String description;
//    private BillingServiceID billingServiceID;
    private BillHash billHash;
    private String paymentChannel;
    private int paymentCode;

    @Data
    public class Originator{
        private String bill;
        private String msisdn;
    }
    @Data
    public class CountryCode{
        private String biller;
        private String country;
    }
    @Data
    public class AccountNumber{
        private String bill;
        private String accountNumber;
    }
    @Data
    public class CurrencyCode{
       private String bill;
       private String currencyCode;

    }
    @Data
    public class Msisdn{
        private String bill;
        private String msisdn;
    }
    @Data
    public class Amount{
        private String bill;
        private double dueAmount;
    }
    @Data
    public class billingServiceResponse{
        private String billingServiceResponse;
        private String billingServiceID;

    }

    @Data
    public class BillHash{
        private String bill;
        private String billID;

    }

}
