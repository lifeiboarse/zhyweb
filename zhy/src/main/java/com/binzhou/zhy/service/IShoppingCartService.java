package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.model.dto.page.ShoppingCartPageDTO;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface IShoppingCartService {


    public ShoppingCart selectByPrimaryKey(Long id);

    public Result<List<ShoppingCartPageDTO>> selectListByOption(ShoppingCart record);

    public int insert(ShoppingCart record);

    public int insertSelective(ShoppingCart record);

    public int update(ShoppingCart record);

    public int updateSelective(ShoppingCart record);

    public int updateNumber(ShoppingCart record);

    public int delete(Long id);
}
