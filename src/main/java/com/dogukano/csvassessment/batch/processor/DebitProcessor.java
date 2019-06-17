package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Debit;
import com.dogukano.csvassessment.model.Record;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class DebitProcessor implements ItemProcessor<Debit, Record> {

    @Override
    public Record process(Debit debit) throws Exception {
        // TODO Get Debit and Check
        /*  -> is Empty
         *  -> is Valid
         *  And Convert to Record
         *  If Amount is bigger thann 500€
         *  Find 5 year tax & split 5 year and create valid record for that debit .
         */
        final Record transformedRecord = new Record();
        transformedRecord.setAccountId(debit.getAccountId());
        log.info("Transformed");
        return transformedRecord;
    }
}
