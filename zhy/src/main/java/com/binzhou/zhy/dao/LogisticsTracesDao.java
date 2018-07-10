package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.LogisticsTraces;
import com.binzhou.zhy.mapper.LogisticsTracesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-08 20:08
 **/
@Component
public class LogisticsTracesDao {

    @Autowired
    LogisticsTracesMapper logisticsTracesMapper;

    public LogisticsTraces selectByPrimaryKey(Long id){
        return logisticsTracesMapper.selectByPrimaryKey(id);
    }

    public List<LogisticsTraces> selectListByOption(LogisticsTraces record){
        return logisticsTracesMapper.selectListByOption(record);
    }
}
