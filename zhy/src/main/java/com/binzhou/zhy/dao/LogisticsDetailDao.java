package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.LogisticsDetail;
import com.binzhou.zhy.mapper.LogisticsDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-06 10:21
 **/
@Component
public class LogisticsDetailDao {

    @Autowired
    LogisticsDetailMapper logisticsDetailMapper;

    public LogisticsDetail selectByPrimaryKey(Long id) {
        return logisticsDetailMapper.selectByPrimaryKey(id);
    }

    public List<LogisticsDetail> selectListByOption(LogisticsDetail record) {
        return logisticsDetailMapper.selectListByOption(record);
    }
}
