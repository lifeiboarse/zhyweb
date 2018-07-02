package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.GoodsDao;
import com.binzhou.zhy.dao.OrderDao;
import com.binzhou.zhy.dao.OrderDetailDao;
import com.binzhou.zhy.dao.ShoppingCartDao;
import com.binzhou.zhy.entity.Goods;
import com.binzhou.zhy.entity.Order;
import com.binzhou.zhy.entity.OrderDetail;
import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.exception.ErrorCodeEnum;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.basic.OrderDetailDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderDetailDao orderDetailDao;

    @Autowired
    GoodsDao goodsDao;

    @Autowired
    ShoppingCartDao shoppingCartDao;

    @Override
    public Result<OrderDTO> getOrderById(Long id) {
        Result<OrderDTO> result = new Result<OrderDTO>();
        if (null == id || id.compareTo(0L) <= 0) {
            result.setErrorCode(ErrorCodeEnum.PARAM_ERROR);
            return result;
        }
        Order order = orderDao.getOrderById(id);
        OrderDTO orderDTO = ObjectConvertUtil.convertOrderToOrderDTO(order);
        result.setData(orderDTO);
        return result;
    }

    public Result<OrderPageDTO> selectListByOption(OrderDTO dto) {

        Result<OrderPageDTO> result = new Result<OrderPageDTO>();
        OrderPageDTO orderPage = new OrderPageDTO();

        List<OrderDetailDTO> orderProductList = new ArrayList<OrderDetailDTO>();

        Order orderParam = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
        List<OrderDTO> orderList = new ArrayList<OrderDTO>();
        List<Order> orderDOList = orderDao.selectListByOption(orderParam);
        for (Order order : orderDOList) {
            OrderDTO orderDTO = ObjectConvertUtil.convertOrderToOrderDTO(order);

            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderId(orderDTO.getId());
            List<OrderDetail> orderDetails = orderDetailDao.selectListByOption(orderDetail);
            orderDTO.setOrderProductList(orderDetails);
            orderList.add(orderDTO);
        }


        orderPage.setOrderList(orderList);
        result.setData(orderPage);
        return result;
    }

    public Result<OrderPageDTO> placeOrder(OrderDTO dto) {

        ShoppingCart record = new ShoppingCart();
        record.setUserId(dto.getUserId());

        Result<OrderPageDTO> result = new Result<OrderPageDTO>();
        OrderPageDTO orderPage = new OrderPageDTO();

        Set<Long> productIds = new HashSet<Long>();

        OrderDTO orderDTO = new OrderDTO();
        BigDecimal productTotal = BigDecimal.valueOf(0);
        BigDecimal orderTotal = BigDecimal.valueOf(0);
        List<ShoppingCart> shoppingCarts = shoppingCartDao.selectListByOption(record);
        for (int i = 0; i < shoppingCarts.size(); i++) {
            ShoppingCart cart = shoppingCarts.get(i);
            productTotal = productTotal.add(cart.getPrice());
            productIds.add(cart.getGoodsId());
        }
        orderDTO.setProductAmountTotal(String.valueOf(productTotal));
        orderDTO.setOrderAmountTotal(String.valueOf(productTotal));

        List<GoodsDTO> cartProductList = new ArrayList<GoodsDTO>();

        for (Long productId : productIds) {
            Goods goods = goodsDao.selectByPrimaryKey(productId);
            GoodsDTO goodsDTO = ObjectConvertUtil.convertGoodsToGoodsDTO(goods);
            //购物车数据构建到订单列表中
            cartProductList.add(goodsDTO);
        }
        orderPage.setOrder(orderDTO);
        orderPage.setCartProductList(cartProductList);
        result.setData(orderPage);
        return result;
    }


    public Result deleteByPrimaryKey(Long id) {
        System.out.println("cart entity:" + id);
        Result result = new Result();
        try {
            int insert = orderDao.deleteByPrimaryKey(id);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    public Result insert(OrderDTO dto) {
        System.out.println("cart entity:" + dto);
        Result result = new Result();
        try {
            Order order = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
            int insert = orderDao.insert(order);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    public Result insertSelective(OrderDTO dto) {
        System.out.println("cart entity:" + dto);
        Result result = new Result();
        try {
            //插入订单
            Order order = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
            int insert = orderDao.insertSelective(order);

            Set<Long> productIds = new HashSet<Long>();

            ShoppingCart record = new ShoppingCart();
            record.setUserId(dto.getUserId());
            List<ShoppingCart> shoppingCarts = shoppingCartDao.selectListByOption(record);
            for (int i = 0; i < shoppingCarts.size(); i++) {
                ShoppingCart cart = shoppingCarts.get(i);
                productIds.add(cart.getGoodsId());
            }

            for (Long productId : productIds) {
                Goods goods = goodsDao.selectByPrimaryKey(productId);

                //购物车数据插入到订单详情表中
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderId(Long.valueOf(insert));
                orderDetail.setProductId(goods.getId());
                orderDetail.setProductName(goods.getName());
                orderDetail.setProductPrice(goods.getPrice());
                orderDetailDao.insertSelective(orderDetail);
            }

            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    public Result updateByPrimaryKeySelective(OrderDTO dto) {
        System.out.println("cart entity:" + dto);
        Result result = new Result();
        try {
            Order order = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
            int insert = orderDao.updateByPrimaryKeySelective(order);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }

    public Result updateByPrimaryKey(OrderDTO dto) {
        System.out.println("cart entity:" + dto);
        Result result = new Result();
        try {
            Order order = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
            int insert = orderDao.updateByPrimaryKey(order);
            result.setData(insert);
            result.setStatus(HttpStatus.CREATED);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return result;
    }
}
