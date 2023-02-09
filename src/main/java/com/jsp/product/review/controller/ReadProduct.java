package com.jsp.product.review.controller;

import com.jsp.product.review.service.ProductService;

public class ReadProduct {
	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		productService.geProductById(1);
	}
}
