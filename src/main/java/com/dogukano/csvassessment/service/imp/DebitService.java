package com.dogukano.csvassessment.service.imp;

import com.dogukano.csvassessment.model.reports.DebitReport;
import com.dogukano.csvassessment.service.adapter.TransactionAdapter;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class DebitService implements TransactionAdapter<DebitReport> {

    @Override
    public DebitReport getReport(Range<Date> range) {
        return null;
    }

    @Override
    public BigDecimal getStatement(Range<Date> range) {
        return null;
    }

    @Override
    public DebitReport getQuarterReport(int year, int quarter) {
        return null;
    }
}
