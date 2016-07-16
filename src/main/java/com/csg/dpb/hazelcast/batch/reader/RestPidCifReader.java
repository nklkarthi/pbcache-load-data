package com.csg.dpb.hazelcast.batch.reader;

import com.csg.dpb.hazelcast.batch.dto.PidCif;
import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nklkarthi on 10/7/16.
 */
@Configuration
public class RestPidCifReader implements ItemReader<PidCif> {
    @Override
    public PidCif read() throws Exception {
        PidCif pidCif = new PidCif();
        pidCif.setPid("M515622");
        return pidCif;
    }

}
