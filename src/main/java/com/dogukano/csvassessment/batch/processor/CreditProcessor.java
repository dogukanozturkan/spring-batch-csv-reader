package com.dogukano.csvassessment.batch.processor;

import com.dogukano.csvassessment.model.Credit;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class CreditProcessor implements ItemProcessor<Credit, Credit> {

    @Override
    public Credit process(@NonNull Credit credit) throws Exception {
        return credit;
    }
}
