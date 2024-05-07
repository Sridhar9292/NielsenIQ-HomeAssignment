package com.nielsoniq.Interview.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nielsoniq.Interview.data.ProductData;
import com.nielsoniq.Interview.data.ShopperData;
import com.nielsoniq.Interview.service.ProductsService;
import com.nielsoniq.Interview.service.ShopperService;

@RestController
@RequestMapping("/data")
public class MyController {

	@Autowired
	private ProductsService productsService;

	@Autowired
	private ShopperService shopperService;

	// External Interface (with eCommerce)
	@GetMapping("/products/{shopperId}")
	public List<ProductData> getProductsByShopper(@PathVariable String shopperId,
			@RequestParam(required = false) String limit) {
		int row = 1;
		if (limit != null) {
			row = Integer.parseInt(limit);
		}

		return productsService.getProductsByShopper(shopperId, row);
	}

	// Internal Interface
	@PostMapping("/shoppers")
	public String shopperSave(@RequestBody ShopperData shopperData) {
		System.out.println(shopperData);
		shopperService.saveShopperDetail(shopperData);
		return null;
	}

}
