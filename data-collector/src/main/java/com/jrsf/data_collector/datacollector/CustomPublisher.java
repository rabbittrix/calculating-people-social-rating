package com.jrsf.data_collector.datacollector;

import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomPublisher{

    @Autowired
    private RabbitTemplate template;

    CalculateSocialRating rating = new CalculateSocialRating();

    @PostMapping("/custom")
    public String publishCustom(@RequestBody CustomData customData){
        customData.setFirst_name(customData.getFirst_name());
        customData.setLast_name(customData.getLast_name());
        customData.setAge(customData.getAge());
        customData.setScore(rating.CalculateRating() * customData.getAge());
        template.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY, customData);
        return "Custom Published";
    }
}
