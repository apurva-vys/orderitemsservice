package com.order.management.orderitems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems")
public class OrderItems {
	@Id
    @GeneratedValue
    private int id;
	@Column
	private String productcode;
	@Column
	private String productname ;
	@Column
	private String quntity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuntity() {
		return quntity;
	}
	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}
	
	
	
}
