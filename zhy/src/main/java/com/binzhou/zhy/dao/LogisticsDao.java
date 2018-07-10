package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Logistics;
import com.binzhou.zhy.mapper.LogisticsDetailMapper;
import com.binzhou.zhy.mapper.LogisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-06 10:22
 **/
@Component
public class LogisticsDao {

    @Autowired
    LogisticsMapper logisticsMapper;

    @Autowired
    LogisticsDetailMapper logisticsDetailMapper;

    public Logistics selectByPrimaryKey(Long id) {
        Logistics logistics = logisticsMapper.selectByPrimaryKey(id);
        return logistics;
    }

    public List<Logistics> selectListByOption(Logistics record) {
        return logisticsMapper.selectListByOption(record);
    }
}
