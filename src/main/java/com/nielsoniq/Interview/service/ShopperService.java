package com.nielsoniq.Interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nielsoniq.Interview.data.ShopperData;
import com.nielsoniq.Interview.entity.Shopper;
import com.nielsoniq.Interview.repository.ShopperRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShopperService {

	@Autowired
	private ShopperRepository shopperRepository;
	
	public void saveShopperDetail(ShopperData shopperData) {
		Shopper shopper = new Shopper();
		shopper.setShopperId(shopperData.getShopperId());
		shopper.setProducts(shopperData.getShelf());
		shopperRepository.save(shopper);
	}

}
