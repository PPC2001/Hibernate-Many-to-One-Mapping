package com.jsp.product.review.controller;

import com.jsp.product.review.dto.Review;
import com.jsp.product.review.service.ReviewService;

public class GetAllReview {
	public static void main(String[] args) {
		
		ReviewService reviewService = new ReviewService();
		
		for (Review r : reviewService.getAllReview()) {
			System.out.println("----------------------");
			System.out.println(r.getId());
			System.out.println(r.getStatus());
			System.out.println(r.getRating());
		}
	}
}
