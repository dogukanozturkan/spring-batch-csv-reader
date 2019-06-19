package com.dogukano.csvassessment.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountId;
    private Date date;
    private String currencyCode;
    private String creditDebit;
    private String counterAccount;
    private String description;
    private Double vatRatio;
    private boolean isCredit;

    @Column(columnDefinition="debitType")
    private String type;
    private BigDecimal total;
    private BigDecimal gross;
    private BigDecimal vat;
}
