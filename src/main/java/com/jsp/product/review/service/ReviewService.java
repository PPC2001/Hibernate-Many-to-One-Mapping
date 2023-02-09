package com.jsp.product.review.service;

import java.util.List;

import javax.persistence.Query;

import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ReviewService {
	ReviewDao reviewDao = new ReviewDao();

	public Review createReview(Review review) {
		return reviewDao.createReview(review);
	}

	public Review getReviewById(int id) {
		return reviewDao.getReviewById(id);
	}

	public Review deleteReviewById(int id) {
		return reviewDao.deleteReviewById(id);
	}

	public Review updateReviewById(int id, int rating, String status) {

		return reviewDao.updateReviewById(id, rating, status);
	}
	
	public List<Review> getAllReview(){

		return reviewDao.getAllReview();		
	}

}
