package com.dogukano.csvassessment.batch.reader;

import com.dogukano.csvassessment.utils.ReportConstants;
import com.dogukano.csvassessment.model.Credit;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

public class CreditReader extends FlatFileItemReader<Credit> {

    public CreditReader() {
        this.setResource(new ClassPathResource("credit2018.csv"));
        this.setName("Credit-Reader");
        this.setLinesToSkip(1);
        this.setLineMapper(creditLineMapper());
    }

    @Bean
    public LineMapper<Credit> creditLineMapper() {

        DefaultLineMapper<Credit> creditDefaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer creditLineTokenizer = new DelimitedLineTokenizer();

        creditLineTokenizer.setDelimiter(";");
        creditLineTokenizer.setStrict(false);
        creditLineTokenizer.setNames(ReportConstants.CreditIems);

        BeanWrapperFieldSetMapper<Credit> creditFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        creditFieldSetMapper.setTargetType(Credit.class);

        creditDefaultLineMapper.setLineTokenizer(creditLineTokenizer);
        creditDefaultLineMapper.setFieldSetMapper(creditFieldSetMapper);

        return creditDefaultLineMapper;
    }
}
