package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.CategoryDao;
import com.binzhou.zhy.dao.GoodsDao;
import com.binzhou.zhy.entity.GoodsDO;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("goodsService")
public class GoogsServiceImpl implements IGoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Autowired
    CategoryDao categoryDao;

    @Override
    public Result<GoodsDTO> selectByPrimaryKey(Long id) {
        Result<GoodsDTO> result = new Result<GoodsDTO>();
        GoodsDO goodsDO = goodsDao.selectByPrimaryKey(id);
        GoodsDTO goodsDTO = ObjectConvertUtil.convertGoodsDOToGoodsDTO(goodsDO);
        result.setData(goodsDTO);
        return result;
    }

    @Override
    public Result<List<GoodsDTO>> selectGoodsListByParam() {
        Result<List<GoodsDTO>> result = new Result<List<GoodsDTO>>();

        List<GoodsDTO> goodsDTOList = new ArrayList<GoodsDTO>();
        List<GoodsDO> goodsDOList = goodsDao.selectGoodsListByParam();
        for (GoodsDO goodsDO : goodsDOList) {
            GoodsDTO goodsDTO = ObjectConvertUtil.convertGoodsDOToGoodsDTO(goodsDO);
            goodsDTOList.add(goodsDTO);
        }
        result.setData(goodsDTOList);
        return result;
    }
}
