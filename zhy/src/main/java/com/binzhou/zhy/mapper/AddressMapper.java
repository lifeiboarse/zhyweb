package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Address;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * AddressMapper数据库操作接口类
 * 
 **/

public interface AddressMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Address  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Address>  selectListByOption(Address record);

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
	int insert(Address record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Address record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Address record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Address record);

}