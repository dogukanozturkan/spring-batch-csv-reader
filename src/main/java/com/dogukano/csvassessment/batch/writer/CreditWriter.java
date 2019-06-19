package com.dogukano.csvassessment.batch.writer;

import com.dogukano.csvassessment.model.Credit;
import java.util.List;
import lombok.NonNull;
import org.springframework.batch.item.ItemWriter;

public class CreditWriter implements ItemWriter<Credit> {

    @Override
    public void write(@NonNull List<? extends Credit> list) throws Exception {

        // TODO Write Items to DB

    }
}
