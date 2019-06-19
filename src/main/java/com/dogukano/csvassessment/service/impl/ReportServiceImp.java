package com.dogukano.csvassessment.service.impl;

import com.dogukano.csvassessment.Utils.ReportUtils;
import com.dogukano.csvassessment.model.reports.Report;
import com.dogukano.csvassessment.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImp implements ReportService {

    @Autowired
    private ReportUtils reportUtils;

    @Override
    public Report getReport(String year, String quarter) {
        return null;
    }
}
