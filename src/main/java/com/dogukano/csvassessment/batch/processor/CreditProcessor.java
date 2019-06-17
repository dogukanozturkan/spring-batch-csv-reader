package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.Record;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CreditProcessor implements ItemProcessor<Credit, Record> {

    public CreditProcessor() {
    }

    @Override
    public Record process(Credit credit) throws Exception {
        // TODO Get Credit and Check
        /*  -> is Empty
        *   -> is Valid
        *   And Convert to Record
        */
        return null;
    }
}
