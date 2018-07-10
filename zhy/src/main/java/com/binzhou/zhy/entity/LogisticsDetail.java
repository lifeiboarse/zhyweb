package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class LogisticsDetail implements Serializable {

	/****/
	private Long id;

	/****/
	private Long logisticsId;

	/****/
	private String firstAmount;

	/****/
	private Integer firstNumber;

	/****/
	private String addAmount;

	/****/
	private Integer addNumber;

	/****/
	private Integer type;

	/****/
	private Long userId;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setLogisticsId(Long logisticsId){
		this.logisticsId = logisticsId;
	}

	public Long getLogisticsId(){
		return this.logisticsId;
	}

	public void setFirstAmount(String firstAmount){
		this.firstAmount = firstAmount;
	}

	public String getFirstAmount(){
		return this.firstAmount;
	}

	public void setFirstNumber(Integer firstNumber){
		this.firstNumber = firstNumber;
	}

	public Integer getFirstNumber(){
		return this.firstNumber;
	}

	public void setAddAmount(String addAmount){
		this.addAmount = addAmount;
	}

	public String getAddAmount(){
		return this.addAmount;
	}

	public void setAddNumber(Integer addNumber){
		this.addNumber = addNumber;
	}

	public Integer getAddNumber(){
		return this.addNumber;
	}

	public void setType(Integer type){
		this.type = type;
	}

	public Integer getType(){
		return this.type;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

}
