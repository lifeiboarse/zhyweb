package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.Category;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 
 * CategoryMapper数据库操作接口类
 * 
 **/

public interface CategoryMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	public Category  selectByPrimaryKey(@Param("id") Long id);

	/**
	 * 
	 * 查询（根据条件查询）
	 * 
	 **/
	public List<Category>  selectListByOption(Category record);

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
	int insert(Category record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Category record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Category record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Category record);

}