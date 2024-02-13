package com.gun.review.service.dto;


import com.gun.review.model.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class ReviewDto {

    private Double avgScore;
    private List<ReviewEntity> reviews;
    private ReviewDtoPage page;


    @AllArgsConstructor
    @Builder
    public static class ReviewDtoPage{
        private Integer offset;
        private Integer limit;
    }
}
