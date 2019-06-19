package com.dogukano.csvassessment.service.imp;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.reports.CreditReport;
import com.dogukano.csvassessment.repository.CreditRepository;
import com.dogukano.csvassessment.service.adapter.TransactionAdapter;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditService implements TransactionAdapter<CreditReport> {

    @Autowired
    CreditRepository creditRepository;

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

    @Override
    public BigDecimal getStatement(Range<Date> range) {
        return null;
    }

    @Override
    public CreditReport getQuarterReport(int year, int quarter) {
        return null;
    }
}
