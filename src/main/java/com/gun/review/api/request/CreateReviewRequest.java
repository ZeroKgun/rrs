package com.gun.review.api.request;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateReviewRequest {

    private Long restaurantId;
    private String content;
    private Double score;
}
