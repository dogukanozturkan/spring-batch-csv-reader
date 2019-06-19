package com.dogukano.csvassessment.model.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "creditTotal",
        "debitTotal",
        "subtractedAmount",
        "currency",
        "status"
})
public class StatementReport {

    @JsonProperty("creditTotal")
    public BigDecimal creditTotal;
    @JsonProperty("debitTotal")
    public BigDecimal debitTotal;
    @JsonProperty("subtractedAmount")
    public BigDecimal subtractedAmount;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("status")
    public String status;

}
