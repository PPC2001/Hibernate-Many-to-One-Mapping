package com.jsp.product.review.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.review.dto.Product;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product createProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		System.out.println("Product Details Saved...");
		return product;
	}

	public Product geProductById(int id) {
		Product p1 = entityManager.find(Product.class, id);

		return p1;
	}

	public Product deleteProductById(int id) {
		Product p1 = entityManager.find(Product.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Product Details deleted....");
		return p1;
	}

	public Product updateProductById(int id, String brand, String name, String type, int price) {

		Product p1 = entityManager.find(Product.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setPrice(price);
			p1.setBrand(brand);
			p1.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("product not found...");
		}
		return p1;
	}

	public List<Product> getAllProduct(){
		String sql = "select s from Product s";
		Query query = entityManager.createQuery(sql);

		List<Product> products = query.getResultList();

		return products;		
	}
	
}
