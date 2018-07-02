package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.model.dto.basic.GoodsDTO;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-30 13:00
 **/

public class GoodsPageDTO {
    private Long googsId;
    private List<GoodsDTO> goodsList;

    public Long getGoogsId() {
        return googsId;
    }

    public void setGoogsId(Long googsId) {
        this.googsId = googsId;
    }

    public List<GoodsDTO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsDTO> goodsList) {
        this.goodsList = goodsList;
    }
}
