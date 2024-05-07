package com.nielsoniq.Interview.data;

import java.util.List;

import com.nielsoniq.Interview.entity.Product;

public class ShopperData {

	private String shopperId;
	private List<Product> shelf;

	public String getShopperId() {
		return shopperId;
	}

	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	public List<Product> getShelf() {
		return shelf;
	}

	public void setShelf(List<Product> shelf) {
		this.shelf = shelf;
	}

	@Override
	public String toString() {
		return "ShopperData [shopperId=" + shopperId + ", shelf=" + shelf + "]";
	}

}
