package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.ProductImage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * ProductImageMapper数据库操作接口类
 * 
 **/

public interface ProductImageMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public ProductImage  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<ProductImage>  selectListByOption(ProductImage record);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(ProductImage record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(ProductImage record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(ProductImage record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(ProductImage record);

}