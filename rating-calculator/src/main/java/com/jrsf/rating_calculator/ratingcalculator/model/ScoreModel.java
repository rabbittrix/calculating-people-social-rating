package com.jrsf.rating_calculator.ratingcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreModel {

    @Id
    private Integer id;
    private Integer score;
}
