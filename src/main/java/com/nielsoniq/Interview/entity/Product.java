package com.nielsoniq.Interview.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT")  
public class Product {

	protected Product() {
	}
	
	public Product(String productId, String category, String brand) {
		super();
		this.productId = productId;
		this.category = category;
		this.brand = brand;
	}

	public Product(String productId, String category, String brand, Shopper shopper) {
		super();
		this.productId = productId;
		this.category = category;
		this.brand = brand;
		this.shopper = shopper;
	}

	@Id
	private String productId;
	private String category;
	private String brand;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SHOPPER_ID")
	private Shopper shopper;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", brand=" + brand + ", shopper="
				+ shopper + "]";
	}
	
}
