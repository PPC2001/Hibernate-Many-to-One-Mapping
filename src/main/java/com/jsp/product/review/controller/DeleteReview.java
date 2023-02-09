package com.jsp.product.review.controller;

import com.jsp.product.review.service.ReviewService;

public class DeleteReview {
	public static void main(String[] args) {
		
		ReviewService reviewService = new  ReviewService();
		reviewService.deleteReviewById(1);
	}
}
