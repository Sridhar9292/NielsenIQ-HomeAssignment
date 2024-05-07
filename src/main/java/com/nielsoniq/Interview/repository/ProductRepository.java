package com.nielsoniq.Interview.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nielsoniq.Interview.entity.Product;
import com.nielsoniq.Interview.entity.Shopper;

public interface ProductRepository extends CrudRepository<Product, String>, PagingAndSortingRepository<Product, String>{
	
	List<Product> findByShopper(Shopper shopper, Pageable pageable);

}
