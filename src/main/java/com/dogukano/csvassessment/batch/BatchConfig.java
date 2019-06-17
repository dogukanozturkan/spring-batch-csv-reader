package com.dogukano.csvassessment.batch;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.model.Debit;
import com.dogukano.csvassessment.model.Record;
import java.util.List;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public JobBuilderFactory jobBuilderFactory;


    @Bean
    public Job csvReadJob(ItemReader<Credit> creditItemReader,
                   ItemProcessor<Credit, Record> creditItemProcessor,
                   ItemWriter<Record> creditItemWriter,

                   ItemReader<Debit> debitItemReader,
                   ItemProcessor<Debit, List<Record>> debitDebitItemProcessor,
                   ItemWriter<List<Record>> debitItemWriter) {
        return jobBuilderFactory.get("csvReadjob").incrementer(new RunIdIncrementer())
                .start(creditRecordsStep(creditItemReader,
                        creditItemProcessor,
                        creditItemWriter))
                .next(debitRecordsStep(debitItemReader,
                        debitDebitItemProcessor,
                        debitItemWriter))
                .build();
    }

    @Bean
    Step creditRecordsStep(ItemReader<Credit> creditItemReader,
                           ItemProcessor<Credit, Record> creditItemProcessor,
                           ItemWriter<Credit> creditItemWriter) {
        return  stepBuilderFactory.get("creditRecordsStep")
                .<Credit, Credit> chunk(50)
                .reader(creditItemReader)
                .processor(creditItemProcessor)
                .writer(creditItemWriter)
                .build();
    }

    @Bean
    Step debitRecordsStep(ItemReader<Debit> debitItemReader,
                          ItemProcessor<Debit, List<Record>> debitDebitItemProcessor,
                          ItemWriter<Record> debitItemWriter) {
        return  stepBuilderFactory.get("debitRecordsStep")
                .<Debit, Debit> chunk(50)
                .reader(debitItemReader)
                .processor(debitDebitItemProcessor)
                .writer(debitItemWriter)
                .build();
    }
}
