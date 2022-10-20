package sample.spring_di.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.spring_di.di.business.service.ProductDao;
import sample.spring_di.di.business.service.ProductService;
import sample.spring_di.di.business.service.ProductServiceImpl;
import sample.spring_di.di.dataaccess.ProductDaoImpl;

@Configuration
public class AppConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	@Bean
	public ProductDao productDao() {
		return new ProductDaoImpl();
	}

}
