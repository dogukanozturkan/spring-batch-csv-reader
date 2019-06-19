package com.dogukano.csvassessment.repository;

import com.dogukano.csvassessment.model.Debit;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitRepository extends JpaRepository<Debit, Long> {

    List<Debit> findByDateBetween(Date startDate, Date endDate);
}
