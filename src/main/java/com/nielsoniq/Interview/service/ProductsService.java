package com.nielsoniq.Interview.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nielsoniq.Interview.data.ProductData;
import com.nielsoniq.Interview.entity.Shopper;
import com.nielsoniq.Interview.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductsService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductData> getProductsByShopper(String shopperId, int limit) {
		Pageable firstPageWithTwoElements = PageRequest.of(0, limit);
		return productRepository.findByShopper(new Shopper(shopperId), firstPageWithTwoElements).stream().map(product -> {
			ProductData data = new ProductData();
			data.setShopperId(product.getShopper().getShopperId());
			data.setProductId(product.getProductId());
			data.setCategory(product.getCategory());
			data.setBrand(product.getBrand());
			return data;
		}).collect(Collectors.toList());
	}
}
