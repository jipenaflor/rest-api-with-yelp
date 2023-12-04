package com.example.resttemplateyelp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "profile_url",
        "image_url",
        "name"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("id")
    private String id;
    @JsonProperty("profile_url")
    private String profileUrl;
    @JsonProperty("image_url")
    private Object imageUrl;
    @JsonProperty("name")
    private String name;
}
