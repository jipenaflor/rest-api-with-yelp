package com.example.resttemplateyelp.controllers;

import com.example.resttemplateyelp.model.Reviews;
import com.example.resttemplateyelp.proxy.ReviewsProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewsController {

    private final ReviewsProxy reviewsProxy;

    public ReviewsController(ReviewsProxy reviewsProxy) {
        this.reviewsProxy = reviewsProxy;
    }

    @GetMapping("/{id}/review")
    public List<String> getReviews(@PathVariable String id) {
        return reviewsProxy.getReviewsOnly(id);
    }

}
