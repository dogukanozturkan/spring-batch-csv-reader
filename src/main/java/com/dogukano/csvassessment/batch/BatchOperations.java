package com.dogukano.csvassessment.batch;

import com.dogukano.csvassessment.batch.processor.CreditProcessor;
import com.dogukano.csvassessment.batch.processor.DebitProcessor;
import com.dogukano.csvassessment.batch.reader.CreditReader;
import com.dogukano.csvassessment.batch.reader.DebitReader;
import com.dogukano.csvassessment.batch.writer.CreditWriter;
import com.dogukano.csvassessment.batch.writer.DebitWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BatchOperations {

    @Bean
    public CreditProcessor creditProcessor() {
        return new CreditProcessor();
    }

    @Bean
    public DebitProcessor debitProcessor() {
        return new DebitProcessor();
    }

    @Bean
    public DebitReader debitReader() {
        return new DebitReader();
    }

    @Bean
    public CreditReader creditReader() {
        return new CreditReader();
    }

    @Bean
    public CreditWriter creditWriter() {
        return new CreditWriter();
    }

    @Bean
    public DebitWriter debitWriter() {
        return new DebitWriter();
    }

}
