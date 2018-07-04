package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.CategoryDao;
import com.binzhou.zhy.dao.ProductDao;
import com.binzhou.zhy.entity.Product;
import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductDao productDao;

    @Autowired
    CategoryDao categoryDao;

    @Override
    public Result<ProductDTO> selectByPrimaryKey(Long id) {
        Result<ProductDTO> result = new Result<ProductDTO>();
        Product goodsDO = productDao.selectByPrimaryKey(id);
        ProductDTO ProductDTO = ObjectConvertUtil.convertProductToProductDTO(goodsDO);
        result.setData(ProductDTO);
        return result;
    }

    @Override
    public Result<List<ProductDTO>> selectListByOption(ProductDTO dto) {
        Result<List<ProductDTO>> result = new Result<List<ProductDTO>>();
        Product goods = ObjectConvertUtil.convertProductDTOToProduct(dto);
        List<ProductDTO> ProductDTOList = new ArrayList<ProductDTO>();
        List<Product> goodsDOList = productDao.selectListByOption(goods);
        for (Product goodsDO : goodsDOList) {
            ProductDTO ProductDTO = ObjectConvertUtil.convertProductToProductDTO(goodsDO);
            ProductDTOList.add(ProductDTO);
        }
        result.setData(ProductDTOList);
        return result;
    }

    @Override
    public Result deleteByPrimaryKey(Long id) {
        System.out.println("cart entity:" + id);
        Result result = new Result();
        try {
            int insert = productDao.deleteByPrimaryKey(id);
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
    public Result insert(ProductDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Product goods = ObjectConvertUtil.convertProductDTOToProduct(record);
            int insert = productDao.insert(goods);
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
    public Result insertSelective(ProductDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Product goods = ObjectConvertUtil.convertProductDTOToProduct(record);
            int insert = productDao.insertSelective(goods);
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
    public Result updateByPrimaryKeySelective(ProductDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Product goods = ObjectConvertUtil.convertProductDTOToProduct(record);
            int insert = productDao.updateByPrimaryKeySelective(goods);
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
    public Result updateByPrimaryKey(ProductDTO record) {
        System.out.println("cart entity:" + record);
        Result result = new Result();
        try {
            Product goods = ObjectConvertUtil.convertProductDTOToProduct(record);
            int insert = productDao.updateByPrimaryKey(goods);
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
