package com.example.resttemplateyelp.proxy;

import com.example.resttemplateyelp.model.Review;
import com.example.resttemplateyelp.model.Reviews;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReviewsProxy {

    private final RestTemplate rest;

    @Value("${name.service.url}")
    private String yelpBusinessUrl;

    public ReviewsProxy(RestTemplate rest) { this.rest = rest; }

    public Reviews getJson(String id) {
        String id_ = id;//"xJMptDaRAG0b9yi3FVN77A"
        String uri = yelpBusinessUrl + "/" + id_ + "/reviews";
        String token = "Bearer ZlWIVFwF9kNHjvlC5Y6us9GJPUjZ1CIXTvbWL6_dwQa2kGreymDZqVENGgr8Iok3c6shKnWN_X5IsBtefjOy" +
                "lC95BsEbQrEE2iI5AkeLk6uuUMDaWCx7I90tOAA9ZXYx";

        HttpHeaders headers = new HttpHeaders();
        headers.add("accept", "application/json");
        headers.add("Authorization", token);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Reviews> response =
                rest.exchange(uri,
                        HttpMethod.GET,
                        httpEntity,
                        Reviews.class);

        return response.getBody();
    }

    public List<String> getReviewsOnly(String id) {
        List<String> reviewsOnly = new ArrayList<>();

        Reviews reviews = this.getJson(id);
        for (Review review: reviews.getReviews()) {
            reviewsOnly.add(review.getText());
        }

        return reviewsOnly;
    }
}
