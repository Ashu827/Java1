package com.spring.springdatademo.mongodb.dao;

import com.spring.springdatademo.mongodb.model.Product;

public interface ProductDAO {
	
	public void add(Product p);	
	
	public void update(Product p);
	
	public void deleteById(String Id);
	

}
