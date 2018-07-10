package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Reputation;
import com.binzhou.zhy.mapper.ReputationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-09 15:22
 **/
@Component
public class ReputationDao {

    @Autowired
    ReputationMapper reputationMapper;

    public int batchInsert(List<Reputation> list){
        return reputationMapper.batchInsert(list);
    }
    public List<Reputation> selectListByOption(Reputation record){
       return reputationMapper.selectListByOption(record);
    }
}
