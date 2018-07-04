package com.binzhou.zhy.dao;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.mapper.ShoppingCartMapper;
import com.binzhou.zhy.model.dto.basic.ShoppingCartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

    public ShoppingCart selectByPrimaryKey(Long id) {
        return shoppingCartMapper.selectByPrimaryKey(id);
    }

    public List<ShoppingCart> selectListByOption(ShoppingCart record) {
        List<ShoppingCart> cartList = shoppingCartMapper.selectListByOption(record);
        return cartList;
    }

    public List<ShoppingCart>  selectListByIds(List<Long> idList){
        List<ShoppingCart> shoppingCarts = shoppingCartMapper.selectListByIds(idList);
        return shoppingCarts;
    }

    public int insert(ShoppingCart record) {
        return shoppingCartMapper.insert(record);
    }

    public int insertSelective(ShoppingCart record) {
        return shoppingCartMapper.insertSelective(record);
    }

    public int update(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKey(record);
    }

    public int updateSelective(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKeySelective(record);
    }

    public int updateNumber(ShoppingCart record) {
        return shoppingCartMapper.updateNumber(record);
    }

    public int deleteCart(Long id) {
        return shoppingCartMapper.deleteByPrimaryKey(id);
    }
}
