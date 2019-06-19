package com.dogukano.csvassessment.service.imp;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.reports.CreditReport;
import com.dogukano.csvassessment.repository.CreditRepository;
import com.dogukano.csvassessment.service.TransactionService;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditService implements TransactionService<CreditReport> {

    @Autowired
    CreditRepository creditRepository;

    // TODO Implement Statement Calculation
    @Override
    public CreditReport getReport(Range<Date> range) {

        List<Credit> credits = creditRepository
                .findByDateSentBetween(
                        range.lowerEndpoint(),
                        range.upperEndpoint());
        credits.toString();
        return CreditReport.builder()
                .credits(
                        creditRepository.findByDateSentBetween(
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
