package org.sergio.webstore.service.impl;

import java.util.List;
import java.util.Map;

import org.sergio.webstore.domain.Product;
import org.sergio.webstore.domain.repository.ProductRepository;
import org.sergio.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getAllProducts();
	}

	@Override
	public void updateAllStock() {
		List<Product> allProducts = productRepository.getAllProducts();
		for (Product product : allProducts) {
			if (product.getUnitsInStock() < 500)
				productRepository.updateStock(product.getProductId(), product.getUnitsInStock() + 1000);
		}

	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByCategory(category);

	}

	@Override
	public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByFilter(filterParams);
	}

	@Override
	public Product getProductById(String productID) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(productID);
	}

	@Override
	public List<Product> getProductsByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByManufacturer(manufacturer);
	}

	@Override
	public List<Product> getProductsByPrice(Map<String, List<Integer>> filterParams) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByPrice(filterParams);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.addProduct(product);

	}

	
	
}
