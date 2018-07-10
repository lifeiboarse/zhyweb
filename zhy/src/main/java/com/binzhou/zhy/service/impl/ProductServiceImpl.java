package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.CategoryDao;
import com.binzhou.zhy.dao.LogisticsDao;
import com.binzhou.zhy.dao.ProductDao;
import com.binzhou.zhy.dao.ProductImageDao;
import com.binzhou.zhy.entity.Logistics;
import com.binzhou.zhy.entity.Product;
import com.binzhou.zhy.entity.ProductImage;
import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.page.ProductPageDTO;
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

    @Autowired
    ProductImageDao productImageDao;

    @Autowired
    LogisticsDao logisticsDao;

    @Override
    public Result<ProductPageDTO> selectByPrimaryKey(Long id) {
        Result<ProductPageDTO> result = new Result<ProductPageDTO>();
        ProductPageDTO pageDTO=new ProductPageDTO();

        Product product = productDao.selectByPrimaryKey(id);

        ProductDTO productDTO = ObjectConvertUtil.convertProductToProductDTO(product);
        pageDTO.setBasicInfo(productDTO);
        pageDTO.setCategory(categoryDao.selectByPrimaryKey(product.getCategoryId()));
        pageDTO.setContent("<p>好大</p>");
        ProductImage image=new ProductImage();
        image.setGoodsId(product.getId());
        pageDTO.setPics(productImageDao.selectListByOption(image));
        Logistics logistics = logisticsDao.selectByPrimaryKey(product.getLogisticsId());
        pageDTO.setLogistics(logistics);

        result.setData(pageDTO);
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
