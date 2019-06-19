package com.dogukano.csvassessment.utils;

import com.google.common.collect.Range;
import java.time.ZoneId;
import java.util.Date;
import org.springframework.stereotype.Component;
import org.threeten.extra.YearQuarter;

@Component
public class ReportUtils {

    public Range<Date> getRange(int year, int quarter) {
        YearQuarter definedQuarter = YearQuarter.of(year, quarter);
        Date startDate = Date.from(definedQuarter
                .atDay(1)
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        Date endDate = Date.from(definedQuarter
                .atEndOfQuarter()
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        return Range.closed(startDate, endDate);
    }
}
