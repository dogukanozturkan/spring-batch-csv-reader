package com.dogukano.csvassessment.service.imp;

import com.dogukano.csvassessment.model.reports.DebitReport;
import com.dogukano.csvassessment.repository.DebitRepository;
import com.dogukano.csvassessment.service.TransactionService;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DebitService implements TransactionService<DebitReport> {

    @Autowired
    DebitRepository debitRepository;

    // TODO Implement Statement Calculation
    @Override
    public DebitReport getReport(Range<Date> range) {

        return DebitReport.builder()
                .debits(
                        debitRepository.findByDateBetween(
                                range.lowerEndpoint(),
                                range.upperEndpoint())
                )
                .build();
    }

    // TODO Implement Tax Calculation
    @Override
    public BigDecimal getStatement(Range<Date> range) {
        return null;
    }

}
