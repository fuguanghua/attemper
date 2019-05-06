package com.github.attemper.core.dao.mapper.monitor;

import com.github.attemper.common.base.BaseMapper;
import com.github.attemper.common.result.dispatch.monitor.JobInstance;
import com.github.attemper.common.result.dispatch.monitor.JobInstanceAct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface JobInstanceMapper extends BaseMapper<JobInstance> {

    @Override
    void add(JobInstance jobInstance);

    void addAct(JobInstanceAct jobInstanceAct);

    @Override
    void update(JobInstance jobInstance);

    void updateAct(JobInstanceAct jobInstanceAct);

    List<JobInstance> list(Map<String, Object> paramMap);

    List<JobInstanceAct> listAct(Map<String, Object> paramMap);

}