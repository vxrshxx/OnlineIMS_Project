package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Orderitem_table")
public class OrderItem {
	@Id

	private int orderitemid;
	private int quantity;
	private int unitprice;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_orderid")
	private List<Order> or;

	public OrderItem(int orderitemid, int quantity, int unitprice, List<Order> or) {
		super();
		this.orderitemid = orderitemid;
		this.quantity = quantity;
		this.unitprice = unitprice;
		this.or = or;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(int orderitemid) {
		this.orderitemid = orderitemid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public List<Order> getOr() {
		return or;
	}

	public void setOr(List<Order> or) {
		this.or = or;
	}
	
	
	
}
