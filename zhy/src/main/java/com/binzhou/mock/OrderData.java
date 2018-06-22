package com.binzhou.mock;

import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.dto.basic.OrderDTO;

import java.util.ArrayList;
import java.util.List;

public class OrderData {
    public static OrderDTO getInstance() {
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(10000L);
        dto.setOrderStatus(10);
        dto.setProductCount(1);
        dto.setProductAmountTotal("10");
        return dto;
    }
    public static GoodsDTO getgoodsDTO() {
        GoodsDTO dto = new GoodsDTO();
        /*dto.setGoodsName("小菜");
        dto.setCommentnum("19");
        dto.setSpecId("1");
        dto.setGoodsImage("../");
        dto.setGoodsNum("18");*/
        return dto;
    }

    public static List<GoodsDTO> getGoodsList() {
        GoodsDTO dto = new GoodsDTO();
        dto.setGoodsName("小菜");
        /*dto.setCommentnum("19");
        dto.setSpecId("1");
        dto.setGoodsImage("../");
        dto.setGoodsNum("18");*/

        GoodsDTO dto1 = new GoodsDTO();
        dto1.setGoodsName("小菜");
       /* dto1.setCommentnum("19");
        dto1.setSpecId("1");
        dto1.setGoodsImage("../");
        dto1.setGoodsNum("18");
*/
        List<GoodsDTO> list=new ArrayList<GoodsDTO>();
        list.add(dto);
        list.add(dto1);
        return list;
    }
    public static List<OrderDTO> getOrderList() {

        List<GoodsDTO> orderGoodsList =new ArrayList<GoodsDTO>();
        orderGoodsList.add(getgoodsDTO());

        List<OrderDTO> list = new ArrayList<OrderDTO>();
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(10000L);
        dto.setOrderStatus(10);
        dto.setProductCount(1);
        dto.setStatus("1");
        dto.setProductAmountTotal("10");
        dto.setOrderGoodsList(orderGoodsList);

        OrderDTO dto1 = new OrderDTO();
        dto1.setOrderId(10000L);
        dto1.setOrderStatus(30);
        dto1.setProductCount(1);
        dto1.setStatus("2");
        dto1.setProductAmountTotal("10");
        dto1.setOrderGoodsList(orderGoodsList);


        OrderDTO dto2 = new OrderDTO();
        dto2.setOrderId(10000L);
        dto2.setOrderStatus(20);
        dto2.setProductCount(1);
        dto2.setStatus("2");
        dto2.setProductAmountTotal("10");
        dto2.setOrderGoodsList(orderGoodsList);

        list.add(dto);
        list.add(dto1);
        list.add(dto2);



        return list;

    }




}
