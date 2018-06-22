package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.GoodsDO;
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

    public GoodsDO selectByPrimaryKey(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    public List<GoodsDO> selectGoodsListByParam() {
        return goodsMapper.selectGoodsListByParam();
    }
}
