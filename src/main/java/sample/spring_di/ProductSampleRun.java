package sample.spring_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.spring_di.config.AppConfig;
import sample.spring_di.di.business.domain.Product;
import sample.spring_di.di.business.service.ProductService;

public class ProductSampleRun {

	public static void main(String[] args) {
		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();
	}

	private void execute() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService productService = ctx.getBean(ProductService.class);
		productService.addProduct(new Product("공책", 100));

		Product product = productService.findByProductName("공책");
		System.out.println(product);
	}

}
