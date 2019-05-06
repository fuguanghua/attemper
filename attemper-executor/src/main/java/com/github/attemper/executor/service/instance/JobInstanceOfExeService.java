package com.github.attemper.executor.service.instance;

import com.github.attemper.executor.service.BaseOfExeServiceAdapter;
import com.github.attemper.common.result.dispatch.monitor.JobInstance;
import com.github.attemper.common.result.dispatch.monitor.JobInstanceAct;
import com.github.attemper.core.dao.mapper.monitor.JobInstanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class JobInstanceOfExeService extends BaseOfExeServiceAdapter {

    @Autowired
    private JobInstanceMapper mapper;

    public void add(JobInstance jobInstance) {
        mapper.add(jobInstance);
    }

    public void update(JobInstance jobInstance) {
        mapper.update(jobInstance);
    }

    public void addAct(JobInstanceAct jobInstanceAct) {
        mapper.addAct(jobInstanceAct);
    }

    public void updateAct(JobInstanceAct jobInstanceAct) {
        mapper.updateAct(jobInstanceAct);
    }
}