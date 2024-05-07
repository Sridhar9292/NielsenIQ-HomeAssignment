package com.nielsoniq.Interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.nielsoniq.Interview.data.ProductData;
import com.nielsoniq.Interview.entity.Product;
import com.nielsoniq.Interview.entity.Shopper;
import com.nielsoniq.Interview.repository.ProductRepository;
import com.nielsoniq.Interview.service.ProductsService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class InterviewApplicationTests {

	@Mock
	private ProductRepository productRepository;
	
	@Autowired
	private ProductsService productsService;
	
	@Test
	public void getProductsByShopperTest() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("MB-2011193398", "Gents", "Spirit", new Shopper("S-3000")));
		products.add(new Product("BB-1144746855", "Babies", "Babyom", new Shopper("S-3000")));
		products.add(new Product("MD-544464697", "Ladies", "Beauty", new Shopper("S-3000")));
		
		Mockito.when(productRepository.findByShopper(new Shopper("S-3000"), PageRequest.of(0, 5))).thenReturn(products);
		List<ProductData> productsData = productsService.getProductsByShopper("S-3000", 5);
		assertEquals(productsData, products);
	
	}

}
