package com.dogukano.csvassessment.resource;

import com.dogukano.csvassessment.model.reports.Report;
import com.dogukano.csvassessment.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales-tax")
public class ReportResource {

    @Autowired
    ReportService reportService;

    @GetMapping("/{year}/quarter/{quarter}")
    public Report getReport(@PathVariable("year") final int year,
            @PathVariable("quarter") final int quarter) {

        return reportService.getQuarterlyReport(quarter, year);
    }

}
