package com.csg.dpb.hazelcast.batch.config;

import com.csg.dpb.hazelcast.batch.HazelcastClientSettings;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nklkarthi on 10/7/16.
 */
@Configuration
public class HazelcastClientConfiguration {

    @Autowired
    HazelcastClientSettings hazelcastClientSettings;

    public HazelcastClientConfiguration() {
    }

    @Bean
    public HazelcastInstance createClient() {
        ClientConfig config = new ClientConfig();
        setupGroupConfig(config);
        setupNetworkConfig(config);
        return HazelcastClient.newHazelcastClient(config);
    }

    public void setupNetworkConfig(ClientConfig config) {
        ClientNetworkConfig clientNetworkConfig = config.getNetworkConfig();
        List<String> addresses = new ArrayList();
        addresses.add(hazelcastClientSettings.getAddress());
        clientNetworkConfig.setAddresses(addresses);
        clientNetworkConfig.setConnectionAttemptLimit(5);
    }

    public void setupGroupConfig(ClientConfig config) {
        config.getGroupConfig().setName("dev").setPassword("dev-pass");
    }

}

