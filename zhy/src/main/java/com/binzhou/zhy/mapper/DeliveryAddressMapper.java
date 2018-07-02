package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.DeliveryAddress;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * DeliveryAddressMapper数据库操作接口类
 * 
 **/

public interface DeliveryAddressMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public DeliveryAddress  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<DeliveryAddress>  selectListByOption(DeliveryAddress record);

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
	int insert(DeliveryAddress record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(DeliveryAddress record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(DeliveryAddress record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(DeliveryAddress record);

}