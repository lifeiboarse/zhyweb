package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.dto.basic.ShoppingCartDTO;

/**
 * @author lifeifei
 * @create 2018-06-26 15:23
 **/

public class ShoppingCartPageDTO {

    private ShoppingCartDTO cart;
    private GoodsDTO goods;

    public ShoppingCartDTO getCart() {
        return cart;
    }

    public void setCart(ShoppingCartDTO cart) {
        this.cart = cart;
    }

    public GoodsDTO getGoods() {
        return goods;
    }

    public void setGoods(GoodsDTO goods) {
        this.goods = goods;
    }
}
