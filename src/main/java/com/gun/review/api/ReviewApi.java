package com.gun.review.api;

import com.gun.review.api.request.CreateReviewRequest;
import com.gun.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ReviewApi {

    private final ReviewService reviewService;

    @PostMapping("/review")
    public void createReview(
            @RequestBody CreateReviewRequest request
    ){
        reviewService.createReview(request.getRestaurantId(), request.getContent(), request.getScore());

    }

    @DeleteMapping("/review/{reviewId}")
    public void deleteReview(
            @PathVariable Long reviewId
    ){
        reviewService.deleteReview(reviewId);
    }

}
