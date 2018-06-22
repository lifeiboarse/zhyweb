package com.binzhou.zhy.mapper;


import com.binzhou.zhy.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * OrderMapper数据库操作接口类
 *
 **/

@Mapper
public interface OrderMapper {

    /**
     *
     * 查询（根据主键ID查询）
     *
     **/
    OrderDO selectByPrimaryKey (@Param("orderId") Long orderId );

    /**
     * 查询
     * @return
     */
    public List<OrderDO> selecOrdertListByParam();
    /**
     *
     * 删除（根据主键ID删除）
     *
     **/
    int deleteByPrimaryKey ( @Param("orderId") Long orderId);

    /**
     *
     * 添加
     *
     **/
    int insert( OrderDO record );

    /**
     *
     * 添加 （匹配有值的字段）
     *
     **/
    int insertSelective( OrderDO record );

    /**
     *
     * 修改 （匹配有值的字段）
     *
     **/
    int updateByPrimaryKeySelective( OrderDO record );

    /**
     *
     * 修改（根据主键ID修改）
     *
     **/
    int updateByPrimaryKey ( OrderDO record );



}
