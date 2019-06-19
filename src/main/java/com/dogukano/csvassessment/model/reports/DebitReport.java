package com.dogukano.csvassessment.model.reports;

import com.dogukano.csvassessment.model.Debit;
import com.dogukano.csvassessment.model.TotalVat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "debits",
        "totalVAT"
})
public class DebitReport {

    @Singular
    @JsonProperty("debits")
    public List<Debit> debits;
    @JsonProperty("totalVAT")
    public TotalVat totalVat;

}
