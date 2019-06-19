package com.dogukano.csvassessment.model.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "year",
        "quarter",
        "creditReport",
        "debitReport",
        "statementReport"
})
public class Report {

    @JsonProperty("year")
    public String year;
    @JsonProperty("quarter")
    public String quarter;
    @JsonProperty("creditReport")
    public CreditReport creditReport;
    @JsonProperty("debitReport")
    public DebitReport debitReport;
    @JsonProperty("statementReport")
    public StatementReport statementReport;

}