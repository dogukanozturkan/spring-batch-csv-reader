package com.dogukano.csvassessment.repository;

import com.dogukano.csvassessment.model.Debit;
import com.dogukano.csvassessment.model.reports.DebitReport;
import com.google.common.collect.Range;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitRepository extends JpaRepository<Debit, Long> {

    BigDecimal calculateStatementByRange(Range<Date> range);

    List<Debit> findByDateBetween(Date startDate, Date endDate);
}
