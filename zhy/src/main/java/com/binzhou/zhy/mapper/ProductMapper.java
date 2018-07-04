package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Product;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * ProductMapper数据库操作接口类
 * 
 **/

public interface ProductMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Product  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Product>  selectListByOption(Product record);

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
	int insert(Product record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Product record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Product record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Product record);

}