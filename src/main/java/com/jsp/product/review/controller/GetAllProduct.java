package com.jsp.product.review.controller;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.service.ProductService;


public class GetAllProduct {
	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		for (Product p : productService.getAllProduct()) {
			System.out.println("---------------");
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getName());
			System.out.println(p.getType());
			System.out.println(p.getPrice());
		}
	}
}
