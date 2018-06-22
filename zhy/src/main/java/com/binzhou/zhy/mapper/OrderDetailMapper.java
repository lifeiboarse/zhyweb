package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * OrderDetailMapper数据库操作接口类
 * 
 **/

public interface OrderDetailMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public OrderDetail selectByPrimaryKey (@Param("orderDetailId") Long orderDetailId );

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey ( @Param("orderDetailId") Long orderDetailId );

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert( OrderDetail record );

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective( OrderDetail record );

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective( OrderDetail record );

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey ( OrderDetail record );

}