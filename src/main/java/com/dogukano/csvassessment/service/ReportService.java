package com.dogukano.csvassessment.service;

import com.dogukano.csvassessment.model.reports.Report;

public interface ReportService {

    Report getReport(String year, String quarter);
}
