package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.ShoppingCart;

import java.util.List;

public interface IShoppingCartService {


    public ShoppingCart selectByPrimaryKey(Long id);
    public List<ShoppingCart> selectCartListByParam();
    public int insertSelective(ShoppingCart record);

    public int deleteCart(Long id);
}
