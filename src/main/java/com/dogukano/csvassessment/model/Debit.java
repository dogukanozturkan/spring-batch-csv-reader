package com.dogukano.csvassessment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(value = {
        "accountId",
        "date",
        "currencyCode",
        "creditDebit",
        "amount",
        "counterAccount",
        "description",
        "VAT",
        "type"
})
public class Debit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @JsonProperty("accountId")
    public String accountId;

    @JsonProperty("date")
    public Date date;

    @JsonProperty("currencyCode")
    public String currencyCode;

    @JsonProperty("creditDebit")
    public String creditDebit;

    @JsonProperty("amount")
    public BigDecimal amount;

    @JsonProperty("counterAccount")
    public String counterAccount;

    @JsonProperty("description")
    public String description;

    @JsonProperty("VAT")
    public Double vatRatio;

    @JsonProperty("type")
    public String type;

}