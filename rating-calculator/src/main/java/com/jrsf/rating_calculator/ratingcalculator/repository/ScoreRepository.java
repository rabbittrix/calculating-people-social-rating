package com.jrsf.rating_calculator.ratingcalculator.repository;

import com.jrsf.rating_calculator.ratingcalculator.model.ScoreModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<ScoreModel, Integer> {

}
