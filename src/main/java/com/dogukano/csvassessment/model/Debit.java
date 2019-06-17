package com.dogukano.csvassessment.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Debit {

    private String accountId;
    private Date date;
    private String currencyCode;
    private String creditDebit;
    private BigDecimal amount;
    private String counterAccount;
    private String description;
    private Double vat;
    private String type;
}
