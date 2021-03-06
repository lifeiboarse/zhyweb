package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Goods;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * GoodsMapper数据库操作接口类
 * 
 **/

public interface GoodsMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Goods  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Goods>  selectListByOption(Goods record);

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
	int insert(Goods record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Goods record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Goods record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Goods record);

}