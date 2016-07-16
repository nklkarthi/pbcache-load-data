package com.csg.dpb.hazelcast.batch.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by nklkarthi on 16/7/16.
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "hazelcast.client")
public class HazelcastClientSettings {

    private String config;

    /**
     * @return Gets the value of config and returns config
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the config
     * You can use getConfig() to get the value of config
     */
    public void setConfig(String config) {
        this.config = config;
    }
}
