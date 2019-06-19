package com.dogukano.csvassessment.service.imp;

import com.dogukano.csvassessment.model.reports.CreditReport;
import com.dogukano.csvassessment.model.reports.DebitReport;
import com.dogukano.csvassessment.model.reports.Report;
import com.dogukano.csvassessment.model.reports.StatementReport;
import com.dogukano.csvassessment.service.ReportService;
import com.dogukano.csvassessment.utils.ReportConstants;
import com.dogukano.csvassessment.utils.ReportUtils;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuarterReportService implements ReportService {

    @Autowired
    private ReportUtils reportUtils;

    @Autowired
    private CreditService creditService;

    @Autowired
    private DebitService debitService;

    @Override
    public Report getQuarterReport(int year, int quarter) {

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
        return creditService.getReport(range);
    }

    private DebitReport getDebitReport(Range<Date> range) {
        return debitService.getReport(range);
    }

    private StatementReport getStatementReport(Range<Date> range) {

        BigDecimal creditTotal = creditService.getStatement(range);
        BigDecimal debitTotal = debitService.getStatement(range);

        return StatementReport.builder()
                .creditTotal(creditTotal)
                .debitTotal(debitTotal)
                .subtractedAmount(creditTotal.subtract(debitTotal))
                .currency(ReportConstants.CURRENCY)
                .status(creditTotal.subtract(debitTotal).signum() > 0 ? ReportConstants.PROFIT : ReportConstants.LOSS)
                .build();

    }
}
