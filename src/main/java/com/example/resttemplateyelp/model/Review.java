package com.example.resttemplateyelp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "url",
        "text",
        "rating",
        "time_created",
        "user"
})
@Generated("jsonschema2pojo")
public class Review {
    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("text")
    private String text;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("time_created")
    private String timeCreated;
    @JsonProperty("user")
    private User user;

    public String getText() {
        return text;
    }
}
