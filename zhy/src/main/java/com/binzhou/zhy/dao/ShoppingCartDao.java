package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务dao
 *
 * @author lifeifei
 * @create 2018-06-21 10:39
 **/

@Component
public class ShoppingCartDao {

    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    public ShoppingCart selectByPrimaryKey(Long id){
        return shoppingCartMapper.selectByPrimaryKey(id);
    }

    public List<ShoppingCart> selectCartListByParam(){
        return shoppingCartMapper.selectCartListByParam();
    }

    public int insertSelective(ShoppingCart record){
        return shoppingCartMapper.insertSelective(record);
    }
}
