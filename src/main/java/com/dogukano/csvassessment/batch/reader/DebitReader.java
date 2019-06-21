package com.dogukano.csvassessment.batch.reader;

import com.dogukano.csvassessment.utils.ReportConstants;
import com.dogukano.csvassessment.model.Debit;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DebitReader extends FlatFileItemReader<Debit> {

    @Value("{debit.path}")
    private Resource resource;

    public DebitReader () {
        this.setResource(resource);
        this.setName("Debit-Reader");
        this.setLinesToSkip(1);
        this.setLineMapper(debitLineMapper());
    }

    @Bean
    public LineMapper<Debit> debitLineMapper() {

        DefaultLineMapper<Debit> debitDefaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer debitLineTokenizer = new DelimitedLineTokenizer();

        debitLineTokenizer.setDelimiter("${csv.delimiter}");
        debitLineTokenizer.setStrict(false);
        debitLineTokenizer.setNames(ReportConstants.DebitItems);

        BeanWrapperFieldSetMapper<Debit> debitFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        debitFieldSetMapper.setTargetType(Debit.class);

        debitDefaultLineMapper.setLineTokenizer(debitLineTokenizer);
        debitDefaultLineMapper.setFieldSetMapper(debitFieldSetMapper);

        return debitDefaultLineMapper;
    }
}
