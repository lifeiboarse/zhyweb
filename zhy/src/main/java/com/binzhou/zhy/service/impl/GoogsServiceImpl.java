package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.CategoryDao;
import com.binzhou.zhy.dao.GoodsDao;
import com.binzhou.zhy.entity.Goods;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        Goods goodsDO = goodsDao.selectByPrimaryKey(id);
        GoodsDTO goodsDTO = ObjectConvertUtil.convertGoodsToGoodsDTO(goodsDO);
        result.setData(goodsDTO);
        return result;
    }

    @Override
    public Result<List<GoodsDTO>> selectListByOption(GoodsDTO dto) {
        Result<List<GoodsDTO>> result = new Result<List<GoodsDTO>>();
        Goods goods = ObjectConvertUtil.convertGoodsDTOtoGoods(dto);
        List<GoodsDTO> goodsDTOList = new ArrayList<GoodsDTO>();
        List<Goods> goodsDOList = goodsDao.selectListByOption(goods);
        for (Goods goodsDO : goodsDOList) {
            GoodsDTO goodsDTO = ObjectConvertUtil.convertGoodsToGoodsDTO(goodsDO);
            goodsDTOList.add(goodsDTO);
        }
        result.setData(goodsDTOList);
        return result;
    }

    @Override
    public Result deleteByPrimaryKey(Long id) {
        System.out.println("cart entity:" + id);
        Result result = new Result();
        try {
            int insert = goodsDao.deleteByPrimaryKey(id);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @Override
    public Result insert(GoodsDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Goods goods = ObjectConvertUtil.convertGoodsDTOtoGoods(record);
            int insert = goodsDao.insert(goods);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @Override
    public Result insertSelective(GoodsDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Goods goods = ObjectConvertUtil.convertGoodsDTOtoGoods(record);
            int insert = goodsDao.insertSelective(goods);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @Override
    public Result updateByPrimaryKeySelective(GoodsDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Goods goods = ObjectConvertUtil.convertGoodsDTOtoGoods(record);
            int insert = goodsDao.updateByPrimaryKeySelective(goods);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    @Override
    public Result updateByPrimaryKey(GoodsDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Goods goods = ObjectConvertUtil.convertGoodsDTOtoGoods(record);
            int insert = goodsDao.updateByPrimaryKey(goods);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }
}
