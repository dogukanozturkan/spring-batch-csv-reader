package com.dogukano.csvassessment.model;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SalesTax {
    private List<Record> results;
    private List<AggregateVat> quarterly;
}
