package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.GoodsDao;
import com.binzhou.zhy.dao.ShoppingCartDao;
import com.binzhou.zhy.entity.Goods;
import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.model.dto.page.ShoppingCartPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-21 13:08
 **/

@Service("cartService")
public class ShoppingCartServiceImpl implements IShoppingCartService {

    @Autowired
    ShoppingCartDao shoppingCartDao;
    @Autowired
    GoodsDao goodsDao;

    @Override
    public ShoppingCart selectByPrimaryKey(Long id) {
        return shoppingCartDao.selectByPrimaryKey(id);
    }

    @Override
    public Result<List<ShoppingCartPageDTO>> selectListByOption(ShoppingCart record) {
        Result<List<ShoppingCartPageDTO>> result = new Result<List<ShoppingCartPageDTO>>();
        List<ShoppingCartPageDTO> cartPageList = new ArrayList<ShoppingCartPageDTO>();
        List<ShoppingCart> cartList = shoppingCartDao.selectListByOption(record);
        for (ShoppingCart cart : cartList) {
            ShoppingCartPageDTO cartPageDTO = new ShoppingCartPageDTO();
            Goods goods = goodsDao.selectByPrimaryKey(cart.getGoodsId());
            cartPageDTO.setCart(ObjectConvertUtil.convertCartToCartDTO(cart));
            cartPageDTO.setGoods(ObjectConvertUtil.convertGoodsToGoodsDTO(goods));
            cartPageList.add(cartPageDTO);
        }
        result.setData(cartPageList);
        return result;
    }

    @Override
    public int insert(ShoppingCart record) {
        return shoppingCartDao.insertSelective(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartDao.insertSelective(record);
    }

    @Override
    public int update(ShoppingCart record) {
        return shoppingCartDao.update(record);
    }

    @Override
    public int updateSelective(ShoppingCart record) {
        return shoppingCartDao.updateSelective(record);
    }

    @Override
    public int updateNumber(ShoppingCart record) {
        return shoppingCartDao.updateNumber(record);
    }

    @Override
    public int delete(Long id) {
        return shoppingCartDao.deleteCart(id);
    }
}
