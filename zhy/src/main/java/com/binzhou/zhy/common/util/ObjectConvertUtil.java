package com.binzhou.zhy.common.util;

import com.binzhou.zhy.entity.GoodsDO;
import com.binzhou.zhy.entity.OrderDO;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.dto.basic.OrderDTO;

public class ObjectConvertUtil {
    public static OrderDTO convertOrderDOToOrderDTO(OrderDO orderDO) {
        if (null == orderDO) {
            return null;
        }
        OrderDTO dto = new OrderDTO();

        return dto;
    }

    public static GoodsDTO convertGoodsDOToGoodsDTO(GoodsDO goodsDO) {
        if (null == goodsDO) {
            return null;
        }
        GoodsDTO dto = new GoodsDTO();
        dto.setGoodsId(goodsDO.getGoodsId());
        dto.setGoodsName(goodsDO.getGoodsName());
        dto.setCateId(goodsDO.getCateId());
        dto.setCateName(goodsDO.getCateName());
        dto.setPrice(goodsDO.getPrice());
        dto.setUnit(goodsDO.getUnit());
        dto.setStoreId(goodsDO.getStoreId());
        dto.setDefaultImage(goodsDO.getDefaultImage());
        dto.setDescription(goodsDO.getDescription());
        return dto;
    }

}
