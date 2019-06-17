package com.dogukano.csvassessment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AggregateVat {
    private String type;
    private String sum;
    private String quarter;
    private String year;
}
