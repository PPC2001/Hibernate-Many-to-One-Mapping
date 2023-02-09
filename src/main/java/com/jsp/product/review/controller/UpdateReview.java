package com.jsp.product.review.controller;

import com.jsp.product.review.service.ReviewService;

public class UpdateReview {
	public static void main(String[] args) {
		

		ReviewService reviewService = new  ReviewService();
		reviewService.updateReviewById(1, 4, "Good");
	}
}
