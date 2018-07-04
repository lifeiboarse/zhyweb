package com.binzhou.zhy.common.util;

import com.binzhou.zhy.entity.Order;
import com.binzhou.zhy.entity.Product;
import com.binzhou.zhy.entity.ShoppingCart;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.basic.ShoppingCartDTO;

public class ObjectConvertUtil {
    public static OrderDTO convertOrderToOrderDTO(Order order) {
        if (null == order) {
            return null;
        }
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setOrderNo(order.getOrderNo());
        dto.setShopId(order.getShopId());
        dto.setOrderStatus(order.getOrderStatus());
        dto.setProductCount(order.getProductCount());
        dto.setProductTotalPrice(order.getProductTotalPrice());
        dto.setOrderTotalPrice(order.getOrderTotalPrice());
        dto.setLogisticsFee(order.getLogisticsFee());
        dto.setIsUnpackingInspection(order.getIsUnpackingInspection());
        dto.setOpenInvoice(order.getOpenInvoice());
        dto.setInvoiceId(order.getInvoiceId());
        dto.setAddressId(order.getAddressId());
        dto.setOrderlogisticsId(order.getOrderlogisticsId());
        dto.setPayChannel(order.getPayChannel());
        dto.setOutTradeNo(order.getOutTradeNo());
        dto.setUserId(order.getUserId());
        dto.setCustomerRemark(order.getCustomerRemark());
        dto.setOrderSettlementStatus(order.getOrderSettlementStatus());
        dto.setIsDeleted(order.getIsDeleted());
        dto.setOperStatus(order.getOperStatus());
        dto.setStatus(order.getStatus());
        dto.setModifier(order.getModifier());
        return dto;
    }

    public static Order convertOrderDTOtoOrder(OrderDTO dto) {
        if (null == dto) {
            return null;
        }
        Order order = new Order();
        order.setId(dto.getId());
        order.setOrderNo(dto.getOrderNo());
        order.setShopId(dto.getShopId());
        order.setOrderStatus(dto.getOrderStatus());
        order.setProductCount(dto.getProductCount());
        order.setProductTotalPrice(dto.getProductTotalPrice());
        order.setOrderTotalPrice(dto.getOrderTotalPrice());
        order.setLogisticsFee(dto.getLogisticsFee());
        order.setIsUnpackingInspection(dto.getIsUnpackingInspection());
        order.setOpenInvoice(dto.getOpenInvoice());
        order.setInvoiceId(dto.getInvoiceId());
        order.setAddressId(dto.getAddressId());
        order.setOrderlogisticsId(dto.getOrderlogisticsId());
        order.setPayChannel(dto.getPayChannel());
        order.setOutTradeNo(dto.getOutTradeNo());
        order.setUserId(dto.getUserId());
        order.setCustomerRemark(dto.getCustomerRemark());
        order.setOrderSettlementStatus(dto.getOrderSettlementStatus());
        order.setIsDeleted(dto.getIsDeleted());
        order.setOperStatus(dto.getOperStatus());
        order.setStatus(dto.getStatus());
        order.setModifier(dto.getModifier());
        return order;
    }

    public static ProductDTO convertProductToProductDTO(Product goodsDO) {
        if (null == goodsDO) {
            return null;
        }
        ProductDTO dto = new ProductDTO();
        dto.setId(goodsDO.getId());
        dto.setName(goodsDO.getName());
        dto.setCateId(goodsDO.getCateId());
        dto.setCateName(goodsDO.getCateName());
        dto.setPrice(goodsDO.getPrice());
        dto.setUnit(goodsDO.getUnit());
        dto.setShopId(goodsDO.getShopId());
        dto.setImage(goodsDO.getImage());
        dto.setDescription(goodsDO.getDescription());
        return dto;
    }

    public static Product convertProductDTOToProduct(ProductDTO goodsDO) {
        if (null == goodsDO) {
            return null;
        }
        Product doEntity = new Product();
        doEntity.setId(goodsDO.getId());
        doEntity.setName(goodsDO.getName());
        doEntity.setCateId(goodsDO.getCateId());
        doEntity.setCateName(goodsDO.getCateName());
        doEntity.setPrice(goodsDO.getPrice());
        doEntity.setUnit(goodsDO.getUnit());
        doEntity.setShopId(goodsDO.getShopId());
        doEntity.setImage(goodsDO.getImage());
        doEntity.setDescription(goodsDO.getDescription());
        return doEntity;
    }


    public static ShoppingCartDTO convertCartToCartDTO(ShoppingCart cart) {
        if (null == cart) {
            return null;
        }
        ShoppingCartDTO dto = new ShoppingCartDTO();
        dto.setId(cart.getId());
        dto.setUserId(cart.getUserId());
        dto.setShopId(cart.getShopId());
        dto.setProductCount(cart.getProductCount());
        dto.setSpecId(cart.getSpecId());
        dto.setProductPrice(cart.getProductPrice());
        dto.setType(cart.getType());
        dto.setProductId(cart.getProductId());
        return dto;
    }

}
