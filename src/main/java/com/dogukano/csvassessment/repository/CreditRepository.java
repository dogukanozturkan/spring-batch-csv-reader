package com.dogukano.csvassessment.repository;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.reports.CreditReport;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {

    BigDecimal calculateStatementByRange(Range<Date> range);

    CreditReport findByRange(Range<Date> range);
}
