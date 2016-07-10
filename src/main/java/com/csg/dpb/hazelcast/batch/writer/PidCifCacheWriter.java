package com.csg.dpb.hazelcast.batch.writer;

import com.csg.dpb.hazelcast.batch.dto.PidCif;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by nklkarthi on 10/7/16.
 */
@Configuration
public class PidCifCacheWriter implements ItemWriter<PidCif> {
    @Override
    public void write(List<? extends PidCif> list) throws Exception {

    }
}
