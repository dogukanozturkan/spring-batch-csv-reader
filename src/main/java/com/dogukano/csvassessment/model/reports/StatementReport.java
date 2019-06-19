package com.dogukano.csvassessment.model.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "currency",
        "status"
})
public class StatementReport {

    @JsonProperty("amount")
    public Double amount;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("status")
    public String status;

}
