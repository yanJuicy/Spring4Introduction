package sample.spring_di.di.business.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import sample.spring_di.config.AppConfig;
import sample.spring_di.di.business.domain.Product;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class})
class ProductServiceTest {

	@Autowired
	private ProductService productService;

	@Test
	void testFindProduct() {
		Product addProduct = new Product("공책", 100);
		productService.addProduct(addProduct);
		Product findProduct = productService.findByProductName("공책");
		assertThat(findProduct, equalTo(addProduct));
	}


}