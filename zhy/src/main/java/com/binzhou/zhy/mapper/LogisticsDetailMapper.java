package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.LogisticsDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * LogisticsDetailMapper数据库操作接口类
 * 
 **/

public interface LogisticsDetailMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public LogisticsDetail  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<LogisticsDetail>  selectListByOption(LogisticsDetail record);

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
	int insert(LogisticsDetail record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(LogisticsDetail record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(LogisticsDetail record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(LogisticsDetail record);

}