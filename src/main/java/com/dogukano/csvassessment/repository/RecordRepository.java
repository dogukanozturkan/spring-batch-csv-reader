package com.dogukano.csvassessment.repository;

import com.dogukano.csvassessment.model.Record;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    // TODO Implement Get Records By Quarter and Year Functionality
    List<Record> findRecordByDateWithin(String date);
}
