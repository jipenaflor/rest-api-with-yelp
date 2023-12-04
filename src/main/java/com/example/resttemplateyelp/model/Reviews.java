package com.example.resttemplateyelp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "reviews",
        "total",
        "possible_languages"
})
@Generated("jsonschema2pojo")
public class Reviews {

    @JsonProperty("reviews")
    private List<Review> reviews = new ArrayList<Review>();
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("possible_languages")
    private List<String> possibleLanguages = new ArrayList<String>();

    public List<Review> getReviews() {
        return reviews;
    }
}
