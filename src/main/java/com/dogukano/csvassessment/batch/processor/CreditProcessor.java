package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.Record;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class CreditProcessor implements ItemProcessor<Credit, Record> {

    @Override
    public Record process(Credit credit) throws Exception {
        final Record transformedRecord = new Record();
        transformedRecord.setAccountId(credit.getAccountId());
        log.info("Transformed");
        return transformedRecord;
    }
}
