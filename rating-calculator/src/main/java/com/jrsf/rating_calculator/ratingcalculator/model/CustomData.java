package com.jrsf.rating_calculator.ratingcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomData{
    private String first_name;
    private String last_name;
    private Integer score;
}