package com.binzhou.zhy.mapper;

import com.binzhou.zhy.entity.GoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * GoodsMapper数据库操作接口类
 **/

public interface GoodsMapper {


    /**
     * 查询（根据主键ID查询）
     **/
    GoodsDO selectByPrimaryKey(@Param("goodsId") Long goodsId);

    /**
     * 查询
     *
     * @return
     */
    List<GoodsDO> selectGoodsListByParam();

    /**
     * 删除（根据主键ID删除）
     **/
    int deleteByPrimaryKey(@Param("goodsId") Long goodsId);

    /**
     * 添加
     **/
    int insert(GoodsDO record);

    /**
     * 添加 （匹配有值的字段）
     **/
    int insertSelective(GoodsDO record);

    /**
     * 修改 （匹配有值的字段）
     **/
    int updateByPrimaryKeySelective(GoodsDO record);

    /**
     * 修改（根据主键ID修改）
     **/
    int updateByPrimaryKey(GoodsDO record);

}