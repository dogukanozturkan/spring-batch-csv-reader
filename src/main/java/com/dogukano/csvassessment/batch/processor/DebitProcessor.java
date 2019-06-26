package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Debit;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class DebitProcessor implements ItemProcessor<Debit, Debit> {

    @Override
    public Debit process(@NonNull Debit debit) throws Exception {
        // TODO Get Debit and Check
        /*  -> is Empty
         *  -> is Valid
         *  And Convert to Record
         *  If Amount is bigger thann 500€
         *  Find 5 year tax & split 5 year and create valid record for that debit .
         */

        return debit;
    }
}
