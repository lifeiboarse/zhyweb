package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Logistics;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * LogisticsMapper数据库操作接口类
 * 
 **/

public interface LogisticsMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Logistics  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Logistics>  selectListByOption(Logistics record);

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
	int insert(Logistics record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Logistics record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Logistics record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Logistics record);

}