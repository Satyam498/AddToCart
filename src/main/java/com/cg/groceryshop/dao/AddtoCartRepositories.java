package com.cg.groceryshop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cg.groceryshop.entity.Product;



public interface AddtoCartRepositories extends CrudRepository<String,Product> {
	
	@Query("from Product where productId=?1 ")
	Product findProductByProductId(String productId);
	
	@Query("from Product where productId=?1")
	List<Product> findProductByProductId1(String productId);

	void save(Product existingProduct);
	
     
}
