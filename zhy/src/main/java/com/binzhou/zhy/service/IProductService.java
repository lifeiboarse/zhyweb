package com.binzhou.zhy.service;

import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.page.ProductPageDTO;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

/**
 * 商品服务化
 *
 * @author lifeifei
 * @create 2018-06-19 19:40
 **/

public interface IProductService {
    
    public Result<ProductPageDTO> selectByPrimaryKey(Long id);

    public Result<List<ProductDTO>> selectListByOption(ProductDTO record);

    public Result deleteByPrimaryKey(Long id);

    public Result insert(ProductDTO record);

    public Result insertSelective(ProductDTO record);

    public Result updateByPrimaryKeySelective(ProductDTO record);

    public Result updateByPrimaryKey(ProductDTO record);
}
