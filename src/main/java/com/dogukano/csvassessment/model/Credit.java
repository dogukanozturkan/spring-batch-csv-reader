package com.dogukano.csvassessment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Credit {
    private String accountId;
    private String date;
    private String currencyCode;
    private String creditDebit;
    private String amount;
    private String counterAccount;
    private String valutadatum;
    private String description;
    private String vat;
    private String dateSent;

}
