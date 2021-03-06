package com.binzhou.zhy.service;

import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

/**
 * 商品服务化
 *
 * @author lifeifei
 * @create 2018-06-19 19:40
 **/

public interface IGoodsService {
    
    public Result<GoodsDTO> selectByPrimaryKey(Long id);

    public Result<List<GoodsDTO>> selectListByOption(GoodsDTO record);

    public Result deleteByPrimaryKey(Long id);

    public Result insert(GoodsDTO record);

    public Result insertSelective(GoodsDTO record);

    public Result updateByPrimaryKeySelective(GoodsDTO record);

    public Result updateByPrimaryKey(GoodsDTO record);
}
