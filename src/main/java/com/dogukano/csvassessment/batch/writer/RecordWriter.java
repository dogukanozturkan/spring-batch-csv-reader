package com.dogukano.csvassessment.batch.writer;

import com.dogukano.csvassessment.model.Record;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

@Slf4j
public class RecordWriter implements ItemWriter<Record> {

    @Override
    public void write(List<? extends Record> records) throws Exception {
        // TODO Write Records to db

        log.info("log send to db");

    }
}
