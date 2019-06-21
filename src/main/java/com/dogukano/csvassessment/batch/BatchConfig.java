package com.dogukano.csvassessment.batch;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.Debit;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {


    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private BatchOperations operations;

    @Bean
    public Job csvReadJob() {
        return jobBuilderFactory.get("csvReadJob").incrementer(new RunIdIncrementer())
                .start(creditRecordsStep())
                .next(debitRecordsStep())
                .build();
    }

    @Bean
    Step creditRecordsStep() {
        return stepBuilderFactory.get("creditRecordsStep")
                .<Credit, Credit>chunk(50)
                .reader(operations.creditReader())
                .processor(operations.creditProcessor())
                .writer(operations.creditWriter())
                .build();
    }

    @Bean
    Step debitRecordsStep() {
        return stepBuilderFactory.get("debitRecordsStep")
                .<Debit, Debit>chunk(50)
                .reader(operations.debitReader())
                .processor(operations.debitProcessor())
                .writer(operations.debitWriter())
                .build();
    }
}
