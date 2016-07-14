package com.csg.dpb.hazelcast.batch.writer;

import com.csg.dpb.hazelcast.batch.dto.PidCif;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by nklkarthi on 10/7/16.
 */
@Configuration
public class PidCifCacheWriter implements ItemWriter<PidCif> {

    @Autowired
    HazelcastInstance hazelcastInstance;

    @Override
    public void write(List<? extends PidCif> list) throws Exception {
        ConcurrentMap<String, PidCif> map = hazelcastInstance.getMap("pidcif-map");
        for (PidCif pidCif : list) {
            map.put(pidCif.getPid(), pidCif);
        }

    }
}
