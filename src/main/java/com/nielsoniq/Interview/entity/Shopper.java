package com.nielsoniq.Interview.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="SHOPPER")  
public class Shopper {

	public Shopper() {
	}

	public Shopper(String shopperId) {
		super();
		this.shopperId = shopperId;
	}
	
	public Shopper(String shopperId, List<Product> products) {
		super();
		this.shopperId = shopperId;
		this.products = products;
	}

	@Id
	private String shopperId;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "shopper", cascade = CascadeType.ALL)
	private List<Product> products;

	public String getShopperId() {
		return shopperId;
	}

	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Shopper [shopperId=" + shopperId + ", products=" + products + "]";
	}
	
}
