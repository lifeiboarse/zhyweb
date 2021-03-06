package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Order;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * OrderMapper数据库操作接口类
 * 
 **/

public interface OrderMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Order  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Order>  selectListByOption(Order record);

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
	int insert(Order record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Order record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Order record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Order record);


	int  delivery(@Param("id") Long id);
}
