package sample.spring_di.di.dataaccess;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import sample.spring_di.di.business.domain.Product;
import sample.spring_di.di.business.service.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {

	private Map<String, Product> storage = new HashMap<>();

	@Override
	public void addProduct(Product product) {
		storage.put(product.getName(), product);
	}

	@Override
	public Product findByProductName(String name) {
		return storage.get(name);
	}
}
