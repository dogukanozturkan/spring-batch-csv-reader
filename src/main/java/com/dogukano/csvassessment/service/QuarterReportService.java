package com.dogukano.csvassessment.service;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.TotalVat;
import com.dogukano.csvassessment.utils.ReportConstants;
import com.dogukano.csvassessment.utils.ReportUtils;
import com.dogukano.csvassessment.model.reports.CreditReport;
import com.dogukano.csvassessment.model.reports.DebitReport;
import com.dogukano.csvassessment.model.reports.Report;
import com.dogukano.csvassessment.model.reports.StatementReport;
import com.dogukano.csvassessment.repository.CreditRepository;
import com.dogukano.csvassessment.repository.DebitRepository;
import com.dogukano.csvassessment.service.ReportService;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuarterReportService implements ReportService {

    @Autowired
    private ReportUtils reportUtils;

    @Autowired
    private CreditRepository creditRepository;

    @Autowired
    private DebitRepository debitRepository;

    @Override
    public Report getQuarterlyReport(int year, int quarter) {

        Range<Date> range = reportUtils.getRange(year, quarter);

        return Report.builder()
                .year(year)
                .quarter(quarter)
                .creditReport(getCreditsReport(range))
                .debitReport(getDebitReport(range))
                .statementReport(getStatementReport(range))
                .build();
    }

    private CreditReport getCreditsReport(Range<Date> range) {
        return creditRepository.findByRange(range);
    }

    private DebitReport getDebitReport(Range<Date> range) {
        return debitRepository.findByRange(range);
    }

    private StatementReport getStatementReport(Range<Date> range) {

        BigDecimal creditTotal = creditRepository.calculateStatementByRange(range);
        BigDecimal debitTotal = debitRepository.calculateStatementByRange(range);

        return StatementReport.builder()
                .creditTotal(creditTotal)
                .debitTotal(debitTotal)
                .subtractedAmount(creditTotal.subtract(debitTotal))
                .currency(ReportConstants.CURRENCY)
                .status(creditTotal.subtract(debitTotal).signum() > 0 ? ReportConstants.PROFIT : ReportConstants.LOSS)
                .build();

    }
}
