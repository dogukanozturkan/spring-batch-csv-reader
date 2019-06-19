package com.dogukano.csvassessment.repository;

import com.dogukano.csvassessment.model.Credit;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {

    List<Credit> findByDateSentBetween(Date startDate, Date endDate);
}
