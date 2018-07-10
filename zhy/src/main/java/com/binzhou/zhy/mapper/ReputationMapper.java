package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Reputation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * ReputationMapper数据库操作接口类
 * 
 **/

public interface ReputationMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Reputation  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Reputation>  selectListByOption(Reputation record);

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
	int insertSelective(Reputation record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int batchInsert(List<Reputation> list);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Reputation record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Reputation record);

}