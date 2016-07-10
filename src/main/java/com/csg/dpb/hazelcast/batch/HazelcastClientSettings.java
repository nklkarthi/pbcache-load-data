package com.csg.dpb.hazelcast.batch;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nklkarthi on 10/7/16.
 */

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "hazelcastclient-settings")

public class HazelcastClientSettings {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
