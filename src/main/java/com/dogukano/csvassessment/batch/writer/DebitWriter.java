package com.dogukano.csvassessment.batch.writer;

import com.dogukano.csvassessment.model.Record;
import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class DebitWriter implements ItemWriter<List<Record>> {

    @Override
    public void write(List<? extends List<Record>> records) throws Exception {
        // TODO Implement DB Writer
    }
}
