package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class LogisticsTraces implements Serializable {

	/****/
	private Long id;

	/****/
	private Long orderNo;

	/****/
	private java.util.Date acceptTime;

	/****/
	private String acceptStation;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setOrderNo(Long orderNo){
		this.orderNo = orderNo;
	}

	public Long getOrderNo(){
		return this.orderNo;
	}

	public void setAcceptTime(java.util.Date acceptTime){
		this.acceptTime = acceptTime;
	}

	public java.util.Date getAcceptTime(){
		return this.acceptTime;
	}

	public void setAcceptStation(String acceptStation){
		this.acceptStation = acceptStation;
	}

	public String getAcceptStation(){
		return this.acceptStation;
	}

}
