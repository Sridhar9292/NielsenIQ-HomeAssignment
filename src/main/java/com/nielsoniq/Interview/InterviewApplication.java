package com.nielsoniq.Interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nielsoniq.Interview.entity.Product;
import com.nielsoniq.Interview.entity.Shopper;
import com.nielsoniq.Interview.repository.ProductRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
@Transactional
public class InterviewApplication implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepo;

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		productRepo.save(new Product("MB-2093193398", "Gents", "Spirit", new Shopper("S-1000")));
		productRepo.save(new Product("BB-2144746855", "Babies", "Babyom", new Shopper("S-1000")));
		productRepo.save(new Product("MD-543564697", "Ladies", "Beauty", new Shopper("S-1000")));
		
		productRepo.save(new Product("MB-2044193398", "Gents", "Spirit", new Shopper("S-2000")));
		productRepo.save(new Product("BB-21442226855", "Babies", "Babyom", new Shopper("S-2000")));
		productRepo.save(new Product("MD-541164697", "Ladies", "Beauty", new Shopper("S-2000")));
		
		productRepo.save(new Product("MB-2011193398", "Gents", "Spirit", new Shopper("S-3000")));
		productRepo.save(new Product("BB-1144746855", "Babies", "Babyom", new Shopper("S-3000")));
		productRepo.save(new Product("MD-544464697", "Ladies", "Beauty", new Shopper("S-3000")));	
		
	}

}
