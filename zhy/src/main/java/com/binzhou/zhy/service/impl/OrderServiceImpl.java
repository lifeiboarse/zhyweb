package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.*;
import com.binzhou.zhy.entity.*;
import com.binzhou.zhy.exception.ErrorCodeEnum;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.basic.OrderDetailDTO;
import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderDetailDao orderDetailDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ShoppingCartDao shoppingCartDao;

    @Autowired
    LogisticsDao logisticsDao;

    @Autowired
    LogisticsTracesDao logisticsTracesDao;

    @Autowired
    AddressDao addressDao;

    @Autowired
    ReputationDao reputationDao;

    @Override
    public Result<OrderPageDTO> getOrderById(Long id) {

        Result<OrderPageDTO> result = new Result<OrderPageDTO>();
        OrderPageDTO pageDTO = new OrderPageDTO();

        if (null == id || id.compareTo(0L) <= 0) {
            result.setErrorCode(ErrorCodeEnum.PARAM_ERROR);
            return result;
        }

        Order order = orderDao.getOrderById(id);
        OrderDTO orderDTO = ObjectConvertUtil.convertOrderToOrderDTO(order);

        OrderDetail orderDetail = orderDetailDao.selectByPrimaryKey(order.getOrderNo());

        List<ProductDTO> productList = new ArrayList<ProductDTO>();

        Product productParam = new Product();
        productParam.setId(orderDetail.getProductId());
        List<Product> products = productDao.selectListByOption(productParam);

        for (Product product : products) {
            productList.add(ObjectConvertUtil.convertProductToProductDTO(product));
        }

        Logistics logistics = new Logistics();
        logistics.setOrderNo(order.getOrderNo());
        List<Logistics> logistics1 = logisticsDao.selectListByOption(logistics);
        pageDTO.setLogistics(logistics1.get(0));

        LogisticsTraces logisticsTraces = new LogisticsTraces();
        logisticsTraces.setOrderNo(order.getOrderNo());
        List<LogisticsTraces> logisticsTraces1 = logisticsTracesDao.selectListByOption(logisticsTraces);
        pageDTO.setLogisticsTraces(logisticsTraces1);

        Address address = addressDao.selectByPrimaryKey(order.getAddressId());

        pageDTO.setAddress(address);
        pageDTO.setOrderInfo(orderDTO);
        pageDTO.setGoods(productList);

        result.setData(pageDTO);
        return result;
    }

    @Override
    public Result<OrderPageDTO> selectListByOption(OrderDTO dto) {

        Result<OrderPageDTO> result = new Result<OrderPageDTO>();
        OrderPageDTO orderPage = new OrderPageDTO();

        List<OrderDetailDTO> orderProductList = new ArrayList<OrderDetailDTO>();

        Map<Long, List<ProductDTO>> goodsMap = new HashMap<Long, List<ProductDTO>>();


        Order orderParam = ObjectConvertUtil.convertOrderDTOtoOrder(dto);
        List<OrderDTO> orderList = new ArrayList<OrderDTO>();
        List<Order> orderDOList = orderDao.selectListByOption(orderParam);
        for (Order order : orderDOList) {
            OrderDTO orderDTO = ObjectConvertUtil.convertOrderToOrderDTO(order);

            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderNo(orderDTO.getOrderNo());
            List<OrderDetail> orderDetails = orderDetailDao.selectListByOption(orderDetail);
            orderDTO.setOrderDetailList(orderDetails);
            orderList.add(orderDTO);

            List<ProductDTO> productList = new ArrayList<ProductDTO>();
            for (OrderDetail orderDetail1 : orderDetails) {
                Product product = productDao.selectByPrimaryKey(orderDetail1.getId());

                productList.add(ObjectConvertUtil.convertProductToProductDTO(product));
            }
            goodsMap.put(order.getId(), productList);
        }

        orderPage.setGoodsMap(goodsMap);
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
            Product product = productDao.selectByPrimaryKey(cart.getProductId());
            productTotal = productTotal.add(product.getPrice().multiply(BigDecimal.valueOf(cart.getProductCount())));
            productIds.add(cart.getProductId());
        }

        orderDTO.setProductTotalPrice(productTotal);
        orderDTO.setOrderTotalPrice(productTotal);

        List<ProductDTO> cartProductList = new ArrayList<ProductDTO>();

        for (Long productId : productIds) {
            Product product = productDao.selectByPrimaryKey(productId);
            ProductDTO goodsDTO = ObjectConvertUtil.convertProductToProductDTO(product);
            //购物车数据构建到订单列表中
            cartProductList.add(goodsDTO);
        }

        orderDTO.setCartProductList(cartProductList);
        orderPage.setOrder(orderDTO);
        result.setData(orderPage);
        return result;
    }


    public Result<OrderPageDTO> generateOrder(List<Long> carts) {
        Result<OrderPageDTO> result = new Result<OrderPageDTO>();
        OrderPageDTO orderPage = new OrderPageDTO();
        Set<Long> productIds = new HashSet<Long>();

        OrderDTO orderDTO = new OrderDTO();
        BigDecimal productTotal = BigDecimal.valueOf(0);
        BigDecimal orderTotal = BigDecimal.valueOf(0);

        List<ShoppingCart> shoppingCarts = shoppingCartDao.selectListByIds(carts);
        for (int i = 0; i < shoppingCarts.size(); i++) {
            ShoppingCart cart = shoppingCarts.get(i);
            Product product = productDao.selectByPrimaryKey(cart.getProductId());
            productTotal = productTotal.add(product.getPrice().multiply(BigDecimal.valueOf(cart.getProductCount())));
            productIds.add(cart.getProductId());
        }
        orderDTO.setProductTotalPrice(productTotal);
        orderDTO.setOrderTotalPrice(productTotal);

        List<ProductDTO> cartProductList = new ArrayList<ProductDTO>();

        for (Long productId : productIds) {
            Product product = productDao.selectByPrimaryKey(productId);
            ProductDTO goodsDTO = ObjectConvertUtil.convertProductToProductDTO(product);
            //购物车数据构建到订单列表中
            cartProductList.add(goodsDTO);
        }

        orderDTO.setCartProductList(cartProductList);
        orderPage.setOrder(orderDTO);
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

    public Result<OrderPageDTO> insertSelective(OrderDTO dto) {
        Result<OrderPageDTO> result = new Result<OrderPageDTO>();

        System.out.println("cart entity:" + dto);

        try {
            //插入订单
            Order orderParam = ObjectConvertUtil.convertOrderDTOtoOrder(dto);

            int insert = orderDao.insertSelective(orderParam);
            Order order = orderDao.getOrderById(orderParam.getId());
            OrderPageDTO page = new OrderPageDTO();
            page.setOrderInfo(ObjectConvertUtil.convertOrderToOrderDTO(order));
            page.setOrderId(orderParam.getId());
            page.setIsNeedLogistics("true");
            page.setId(order.getId());
            page.setAmountTotle(order.getOrderTotalPrice() + "");
            page.setAmountLogistics(order.getOrderTotalPrice() + "");
            page.setDateAdd(order.getGmtCreate());
            page.setAmountReal(order.getOrderTotalPrice() + "");
            page.setOrderNumber(666);


            List<OrderDetail> orderDetailList = dto.getOrderDetailList();
            if (null != orderDetailList && orderDetailList.size() > 0) {
                for (int i = 0; i < orderDetailList.size(); i++) {
                    OrderDetail orderDetail1 = orderDetailList.get(i);
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setGoodsId(orderDetail1.getGoodsId());
                    orderDetail.setNumber(orderDetail1.getNumber());
                    orderDetail.setLogisticsType(orderDetail1.getLogisticsType());
                    orderDetail.setPropertyChildIds(orderDetail1.getPropertyChildIds());
                    orderDetailDao.insertSelective(orderDetail);
                }
            }


            result.setData(page);
            result.setStatus(HttpStatus.CREATED);
            return result;
            /**
             //保存购物车修改状态
             Set<Long> cartIds = new HashSet<Long>();

             ShoppingCart record = new ShoppingCart();
             record.setUserId(dto.getUserId());
             List<ShoppingCart> shoppingCarts = shoppingCartDao.selectListByOption(record);
             for (int i = 0; i < shoppingCarts.size(); i++) {
             ShoppingCart cart = shoppingCarts.get(i);
             cartIds.add(cart.getId());
             Product product = productDao.selectByPrimaryKey(cart.getProductId());
             //购物车数据插入到订单详情表中
             OrderDetail orderDetail = new OrderDetail();
             orderDetail.setOrderNo(Long.valueOf(insert));
             orderDetail.setProductId(product.getId());
             orderDetail.setProductName(product.getName());
             orderDetail.setProductPrice(product.getPrice());
             orderDetail.setProductNumber(cart.getProductCount());
             orderDetailDao.insertSelective(orderDetail);
             }
             //清空购物车
             for (Long id : cartIds) {

             }
             */

        } catch (Exception e) {
            result.setErrorMessage(e.getMessage());
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

    @Override
    public Result delivery(Long id) {
        Result result = new Result();
        int delivery = orderDao.delivery(id);
        result.setData(delivery);
        return result;

    }

    @Override
    public Result batchInsert(List<Reputation> list) {
        Result result = new Result();
        int i = reputationDao.batchInsert(list);
        result.setData(i);
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
