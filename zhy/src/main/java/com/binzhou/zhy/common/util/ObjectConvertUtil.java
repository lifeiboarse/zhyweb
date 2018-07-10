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
        dto.setRemark(order.getRemark());
        dto.setCalculate(order.getCalculate());
        dto.setKjid(order.getKjid());
        dto.setGmtCreate(order.getGmtCreate());
        dto.setGmtModified(order.getGmtModified());
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


        order.setRemark(dto.getRemark());
        order.setCalculate(dto.getCalculate());
        order.setKjid(dto.getKjid());

        order.setGmtCreate(dto.getGmtCreate());
        order.setGmtModified(dto.getGmtModified());
        return order;
    }

    public static ProductDTO convertProductToProductDTO(Product entity) {
        if (null == entity) {
            return null;
        }
        ProductDTO dto = new ProductDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCategoryId(entity.getCategoryId());
        dto.setCateName(entity.getCateName());
        dto.setPrice(entity.getPrice());
        dto.setUnit(entity.getUnit());
        dto.setShopId(entity.getShopId());
        dto.setImage(entity.getImage());
        dto.setDescription(entity.getDescription());

        dto.setBarCode(entity.getBarCode());
        dto.setWeight(entity.getWeight());
        dto.setViews(entity.getViews());
        dto.setVideoId(entity.getVideoId());
        dto.setUserId(entity.getUserId());
        dto.setStores(entity.getStores());
        dto.setStatusStr(entity.getStatusStr());
        dto.setStatus(entity.getStatus());
        dto.setRecommendStatusStr(entity.getRecommendStatusStr());
        dto.setRecommendStatus(entity.getRecommendStatus());
        dto.setPingtuanPrice(entity.getPingtuanPrice());
        dto.setPingtuan(entity.getPingtuan());
        dto.setPic(entity.getPic());
        dto.setPaixu(entity.getPaixu());
        dto.setOriginalPrice(entity.getOriginalPrice());
        dto.setNumberOrders(entity.getNumberOrders());
        dto.setNumberGoodReputation(entity.getNumberGoodReputation());
        dto.setNumberFav(entity.getNumberFav());
        dto.setMinScore(entity.getMinScore());
        dto.setMinPrice(entity.getMinPrice());
        dto.setLogisticsId(entity.getLogisticsId());
        dto.setCommissionType(entity.getCommissionType());
        dto.setCommission(entity.getCommission());
        dto.setCharacteristic(entity.getCharacteristic());

        dto.setProperty(entity.getProperty());
        dto.setNumber(entity.getNumber());
        return dto;
    }

    public static Product convertProductDTOToProduct(ProductDTO dto) {
        if (null == dto) {
            return null;
        }
        Product entity = new Product();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCategoryId(dto.getCategoryId());
        entity.setCateName(dto.getCateName());
        entity.setPrice(dto.getPrice());
        entity.setUnit(dto.getUnit());
        entity.setShopId(dto.getShopId());
        entity.setImage(dto.getImage());
        entity.setDescription(dto.getDescription());

        entity.setWeight(dto.getWeight());
        entity.setViews(dto.getViews());
        entity.setVideoId(dto.getVideoId());
        entity.setUserId(dto.getUserId());
        entity.setStores(dto.getStores());
        entity.setStatusStr(dto.getStatusStr());
        entity.setStatus(dto.getStatus());
        entity.setRecommendStatusStr(dto.getRecommendStatusStr());
        entity.setRecommendStatus(dto.getRecommendStatus());
        entity.setPingtuanPrice(dto.getPingtuanPrice());
        entity.setPingtuan(dto.getPingtuan());
        entity.setPic(dto.getPic());
        entity.setPaixu(dto.getPaixu());
        entity.setOriginalPrice(dto.getOriginalPrice());
        entity.setNumberOrders(dto.getNumberOrders());
        entity.setNumberGoodReputation(dto.getNumberGoodReputation());
        entity.setNumberFav(dto.getNumberFav());
        entity.setMinScore(dto.getMinScore());
        entity.setMinPrice(dto.getMinPrice());
        entity.setLogisticsId(dto.getLogisticsId());
        entity.setCommissionType(dto.getCommissionType());
        entity.setCommission(dto.getCommission());
        entity.setCharacteristic(dto.getCharacteristic());

        entity.setProperty(dto.getProperty());
        entity.setNumber(dto.getNumber());
        return entity;
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
