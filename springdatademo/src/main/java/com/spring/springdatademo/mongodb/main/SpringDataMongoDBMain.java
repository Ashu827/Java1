package com.spring.springdatademo.mongodb.main;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class SpringDataMongoDBMain {
	
	public static final String DB_NAME = "springmongo";
	public static final String PRODUCT_COLLECTION = "Product";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
	public static void main(String args[]){
		
		try {
			MongoClient mongo = new MongoClient(
					MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			
	}
	}

}
