package com.csg.dpb.hazelcast.batch.config;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

/**
 * Created by nklkarthi on 10/7/16.
 */
@Configuration
@EnableBatchProcessing

public class JobConfiguration {

    @Autowired
    HazelcastClientSettings hazelcastClientSettings;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public HazelcastInstance hazelcastInstance() throws IOException {
        ClientConfig clientConfig = new XmlClientConfigBuilder(new File(hazelcastClientSettings.getConfig())).build();
        return HazelcastClient.newHazelcastClient(clientConfig);
    }

    /**
     * @param jobs
     * @param s1
     * @return
     */
    @Bean
    public Job consumeWebserviceJob(JobBuilderFactory jobs, Step s1) {
        return jobBuilderFactory.get("consumeWebserviceJob")
                .incrementer(new RunIdIncrementer())
                .flow(s1)
                .end()
                .build();
    }

    /**
     * @param reader
     * @param writer
     * @return
     */
    @Bean
    public Step jobStep(ItemReader reader, ItemWriter writer) {
        return stepBuilderFactory.get("jobStep")
                .chunk(1)
                .reader(reader)
                .writer(writer)
                .build();

    }

}
