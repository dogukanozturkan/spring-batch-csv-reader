package com.dogukano.csvassessment.service;

import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;

public interface TransactionService<T> {

    T getReport(Range<Date> range);

    BigDecimal getStatement(Range<Date> range);
}
