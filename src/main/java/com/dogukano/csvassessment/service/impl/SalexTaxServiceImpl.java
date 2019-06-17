package com.dogukano.csvassessment.service.impl;

import com.dogukano.csvassessment.model.AggregateVat;
import com.dogukano.csvassessment.model.Record;
import com.dogukano.csvassessment.repository.RecordRepository;
import com.dogukano.csvassessment.service.SalesTaxService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalexTaxServiceImpl implements SalesTaxService {

    @Autowired
    RecordRepository recordRepository;

    public List<Record> findRecordsByQuarter(Date date) {
        // TODO Implement Functionality
        return null;
    }

    public List<AggregateVat> findVatAggregationForQuarter (Date date) {
        // TODO Implement Functionality
        return null;
    }
}
