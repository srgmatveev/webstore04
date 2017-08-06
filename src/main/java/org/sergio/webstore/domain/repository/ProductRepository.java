package org.sergio.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import org.sergio.webstore.domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
	void updateStock(String productId, long noOfUnits);
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
	Product getProductById(String productID);
	List <Product> getProductsByManufacturer(String manufacturer);
	List <Product> getProductsByPrice(Map<String,List<Integer>> filterParams);
	void addProduct(Product product);

}
