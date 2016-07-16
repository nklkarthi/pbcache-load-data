package com.csg.dpb.hazelcast.batch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PbcacheClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(PbcacheClientApplication.class)
                .run(args);

    }
}
