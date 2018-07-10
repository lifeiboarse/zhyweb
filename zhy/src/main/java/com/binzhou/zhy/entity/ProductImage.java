package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class ProductImage implements Serializable {

	/**图片自增ID**/
	private Long id;

	/****/
	private Long userId;

	/**商品ID**/
	private Long productId;

	/**图片地址**/
	private String imageUrl;

	/**缩略图地址**/
	private String thumbnail;

	/****/
	private Long goodsId;

	/**排序号**/
	private Integer sortOrder;

	/**文件ID**/
	private Integer fileId;

	/****/
	private String pic;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setProductId(Long productId){
		this.productId = productId;
	}

	public Long getProductId(){
		return this.productId;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return this.imageUrl;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return this.thumbnail;
	}

	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}

	public Long getGoodsId(){
		return this.goodsId;
	}

	public void setSortOrder(Integer sortOrder){
		this.sortOrder = sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}

	public void setFileId(Integer fileId){
		this.fileId = fileId;
	}

	public Integer getFileId(){
		return this.fileId;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return this.pic;
	}

}
