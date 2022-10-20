package sample.spring_di.di.business.service;

import sample.spring_di.di.business.domain.Product;

public interface ProductService {

	void addProduct(Product product);
	Product findByProductName(String name);
}
