package com.cg.groceryshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "producttable")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String productId;

	@Column
	private String productName1;

	@Column
	private String productName2;

	@Column
	private String productName3;

	@Column
	private String productName4;

	@Column
	private String productName5;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productId, String productName1, String productName2, String productName3,
			String productName4, String productName5) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName1 = productName1;
		this.productName2 = productName2;
		this.productName3 = productName3;
		this.productName4 = productName4;
		this.productName5 = productName5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName1() {
		return productName1;
	}

	public void setProductName1(String productName1) {
		this.productName1 = productName1;
	}

	public String getProductName2() {
		return productName2;
	}

	public void setProductName2(String productName2) {
		this.productName2 = productName2;
	}

	public String getProductName3() {
		return productName3;
	}

	public void setProductName3(String productName3) {
		this.productName3 = productName3;
	}

	public String getProductName4() {
		return productName4;
	}

	public void setProductName4(String productName4) {
		this.productName4 = productName4;
	}

	public String getProductName5() {
		return productName5;
	}

	public void setProductName5(String productName5) {
		this.productName5 = productName5;
	}

}
