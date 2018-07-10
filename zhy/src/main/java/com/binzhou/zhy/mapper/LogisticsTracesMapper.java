package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.LogisticsTraces;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * LogisticsTracesMapper数据库操作接口类
 * 
 **/

public interface LogisticsTracesMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public LogisticsTraces  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<LogisticsTraces>  selectListByOption(LogisticsTraces record);

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
	int insert(LogisticsTraces record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(LogisticsTraces record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(LogisticsTraces record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(LogisticsTraces record);

}