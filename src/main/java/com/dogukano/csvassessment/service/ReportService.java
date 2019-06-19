package com.dogukano.csvassessment.service;

import com.dogukano.csvassessment.model.reports.Report;

public interface ReportService {

    Report getQuarterlyReport(int year, int quarter);
}
