package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Orderstable")
public class Order {
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public BigDecimal getContact_info() {
		return contact_info;
	}
	public void setContact_info(BigDecimal contact_info) {
		this.contact_info = contact_info;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int order_id;
	private Date order_date;
	private String cust_name;
	private BigDecimal contact_info;
	private String shipAddress;
	private int total;
	private String orderStatus;
	public Order(int order_id, Date order_date, String cust_name, BigDecimal contact_info, String shipAddress,
			int total, String orderStatus) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.cust_name = cust_name;
		this.contact_info = contact_info;
		this.shipAddress = shipAddress;
		this.total = total;
		this.orderStatus = orderStatus;
	}
	
	
	
}
