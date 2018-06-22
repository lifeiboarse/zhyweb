package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.dao.ShoppingCartDao;
import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-21 13:08
 **/

@Service("cartService")
public class ShoppingCartServiceImpl implements IShoppingCartService {

    @Autowired
    ShoppingCartDao shoppingCartDao;

    @Override
    public ShoppingCart selectByPrimaryKey(Long id) {
        return shoppingCartDao.selectByPrimaryKey(id);
    }

    @Override
    public List<ShoppingCart> selectCartListByParam() {
        return shoppingCartDao.selectCartListByParam();
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartDao.insertSelective(record);
    }

    @Override
    public int deleteCart(Long id) {
        return 0;
    }
}
