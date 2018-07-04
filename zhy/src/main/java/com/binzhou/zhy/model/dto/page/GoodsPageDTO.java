package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.model.dto.basic.ProductDTO;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-30 13:00
 **/

public class GoodsPageDTO {

    private List<ProductDTO> productList;

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }
}
