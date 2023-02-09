package com.jsp.product.review.controller;

import com.jsp.product.review.service.ProductService;

public class UpdateProduct {
	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		productService.updateProductById(1, "Adidas", "shirt", "Clothing", 1200);
	}
}
