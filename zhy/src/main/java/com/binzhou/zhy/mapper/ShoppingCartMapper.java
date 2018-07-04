package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * ShoppingCartMapper数据库操作接口类
 * 
 **/

public interface ShoppingCartMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public ShoppingCart  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<ShoppingCart>  selectListByOption(ShoppingCart record);

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
	int insert(ShoppingCart record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(ShoppingCart record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(ShoppingCart record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(ShoppingCart record);

    int updateNumber(ShoppingCart record);

	List<ShoppingCart>  selectListByIds(List<Long> idList);
}