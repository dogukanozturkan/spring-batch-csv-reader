package com.dogukano.csvassessment.service.adapter;

public interface ReportServiceAdapter<T> {

    T getQuarterReport(int year, int quarter);

}
