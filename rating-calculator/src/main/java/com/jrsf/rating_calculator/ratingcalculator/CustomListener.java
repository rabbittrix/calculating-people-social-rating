package com.jrsf.rating_calculator.ratingcalculator;

import com.jrsf.rating_calculator.ratingcalculator.config.MQConfig;
import com.jrsf.rating_calculator.ratingcalculator.model.CustomData;
import com.jrsf.rating_calculator.ratingcalculator.model.ScoreModel;
import com.jrsf.rating_calculator.ratingcalculator.repository.ScoreRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomListener {

    @Autowired
    private ScoreRepository repository;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomData data) {
        String name = data.getFirst_name();
        String last = data.getLast_name();
        Integer score = data.getScore();
        System.out.println(name + " " + last + " has " + score + " score");

        ScoreModel scoreModel = new ScoreModel();
        scoreModel.setId(scoreModel.getId());
        scoreModel.setScore(data.getScore());
        Integer s = data.getScore();
        //System.out.println("Recording on redis....");
        repository.save(scoreModel);
        System.out.println("Recording on redis.... " + s);
        System.out.println("Recording on redis.... " + scoreModel);
    }

}
