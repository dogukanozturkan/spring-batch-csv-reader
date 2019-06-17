package com.dogukano.csvassessment.batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BatchLauncher {

    private final Job job;

    private final JobLauncher jobLauncher;

    @Autowired
    BatchLauncher(@Qualifier("csvReadJob")Job job, JobLauncher jobLauncher) {
        this.job = job;
        this.jobLauncher = jobLauncher;
    }

    @SneakyThrows
    @Scheduled(cron = "${batch.job.cron}")
    void launchCsvRecordsToDatabaseJob() {
        log.info("***** Starting csvRecordsToDatabase Job *****");

        jobLauncher.run(job, execution());

        log.info("***** Stoping csvRecordsToDatabase Job *****");
    }

    private JobParameters execution() {
        Map<String, JobParameter> parameters = new HashMap<>();

        JobParameter parameter = new JobParameter(new Date());
        parameters.put("currentTime", parameter);

        return new JobParameters(parameters);
    }
}
