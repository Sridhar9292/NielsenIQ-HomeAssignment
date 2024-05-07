package com.nielsoniq.Interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nielsoniq.Interview.entity.Shopper;

public interface ShopperRepository extends JpaRepository<Shopper, String>{

}
