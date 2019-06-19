package com.dogukano.csvassessment.service.adapter;

import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;

public interface TransactionAdapter<T> extends ReportServiceAdapter<T>{

    T getReport(Range<Date> range);

    BigDecimal getStatement(Range<Date> range);
}
