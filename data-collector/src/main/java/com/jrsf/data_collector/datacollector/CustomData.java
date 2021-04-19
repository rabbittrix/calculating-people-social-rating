package com.jrsf.data_collector.datacollector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomData {
    private String first_name;
    private String last_name;
    private Integer age;
    private Integer score;
}