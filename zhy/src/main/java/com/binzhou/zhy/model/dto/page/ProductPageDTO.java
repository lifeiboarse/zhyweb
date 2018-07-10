package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.entity.Logistics;
import com.binzhou.zhy.entity.ProductImage;
import com.binzhou.zhy.model.dto.basic.ProductDTO;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-05 23:01
 **/

public class ProductPageDTO {
    private ProductDTO basicInfo;
    private String content;
    private List<ProductImage> pics;
    private Category category;
    private Logistics logistics;

    public ProductDTO getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ProductDTO basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<ProductImage> getPics() {
        return pics;
    }

    public void setPics(List<ProductImage> pics) {
        this.pics = pics;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }
}
