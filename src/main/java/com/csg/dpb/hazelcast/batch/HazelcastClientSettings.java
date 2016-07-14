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

    /**
     * @return Gets the value of address and returns address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address
     * You can use getAddress() to get the value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
