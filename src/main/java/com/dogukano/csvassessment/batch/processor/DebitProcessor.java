package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Debit;
import com.dogukano.csvassessment.model.Record;
import java.util.List;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class DebitProcessor implements ItemProcessor<Debit, List<Record>> {


    @Override
    public List<Record> process(Debit debit) throws Exception {
        // TODO Get Debit and Check
        /*  -> is Empty
         *  -> is Valid
         *  And Convert to Record
         *  If Amount is bigger thann 500€
         *  Find 5 year tax & split 5 year and create valid record for that debit .
         */

        return null;
    }
}
