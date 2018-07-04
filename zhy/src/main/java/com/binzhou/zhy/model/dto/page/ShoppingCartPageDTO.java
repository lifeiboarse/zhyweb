package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.basic.ShoppingCartDTO;

/**
 * @author lifeifei
 * @create 2018-06-26 15:23
 **/

public class ShoppingCartPageDTO {

    private ShoppingCartDTO cart;
    private ProductDTO product;

    public ShoppingCartDTO getCart() {
        return cart;
    }

    public void setCart(ShoppingCartDTO cart) {
        this.cart = cart;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}
