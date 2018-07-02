package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Goods;
import com.binzhou.zhy.entity.Order;
import com.binzhou.zhy.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品DAO
 *
 * @author lifeifei
 * @create 2018-06-19 19:21
 **/

@Component
public class GoodsDao {

    /**
     *
     */
    @Autowired
    GoodsMapper goodsMapper;

    public Goods selectByPrimaryKey(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    public List<Goods> selectListByOption(Goods goods) {
        return goodsMapper.selectListByOption(goods);
    }

    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    public int deleteByPrimaryKey(Long id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }
}
