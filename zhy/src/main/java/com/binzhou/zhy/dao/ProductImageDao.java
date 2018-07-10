package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.ProductImage;
import com.binzhou.zhy.mapper.ProductImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-06 10:22
 **/
@Component
public class ProductImageDao {
    @Autowired
    ProductImageMapper productImageMapper;

    public ProductImage selectByPrimaryKey(Long id) {
        return productImageMapper.selectByPrimaryKey(id);
    }

    public List<ProductImage> selectListByOption(ProductImage record) {
        return productImageMapper.selectListByOption(record);
    }
}
