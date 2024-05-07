package com.nielsoniq.Interview.data;

public class ProductData {

	private String productId;
	private String category;
	private String brand;
	private String shopperId;

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

	public String getShopperId() {
		return shopperId;
	}

	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	@Override
	public String toString() {
		return "ProductData [productId=" + productId + ", category=" + category + ", brand=" + brand + ", shopperId="
				+ shopperId + "]";
	}

}
