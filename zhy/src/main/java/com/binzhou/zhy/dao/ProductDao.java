package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Product;
import com.binzhou.zhy.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品DAO
 *
 * @author lifeifei
 * @create 2018-06-19 19:21
 **/

@Component
public class ProductDao {

    /**
     *
     */
    @Autowired
    ProductMapper productMapper;

    public Product selectByPrimaryKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    public List<Product> selectListByOption(Product goods) {
        return productMapper.selectListByOption(goods);
    }

    public int insert(Product record) {
        return productMapper.insert(record);
    }

    public int insertSelective(Product record) {
        return productMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Product record) {
        return productMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }

    public int deleteByPrimaryKey(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }
}
