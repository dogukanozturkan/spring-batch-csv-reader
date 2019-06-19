package com.dogukano.csvassessment.batch.writer;

import com.dogukano.csvassessment.model.Debit;
import java.util.List;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

@Slf4j
public class DebitWriter implements ItemWriter<Debit> {

    @Override
    public void write(@NonNull List<? extends Debit> list) throws Exception {

        // TODO Write Items to DB

    }
}
