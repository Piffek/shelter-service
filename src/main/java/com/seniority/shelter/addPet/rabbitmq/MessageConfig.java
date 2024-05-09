package com.seniority.shelter.addPet.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class MessageConfig {

    @Value("${topic.exchange.name}")
    private String topicExchangeName;

    @Value("${pet.queue.name}")
    private String petQueueName;

    @Value("${pet.routing.key}")
    private String petRoutingKey;

    @Bean
    public Queue petQueue() {
        return new Queue(petQueueName);
    }

    @Bean
    public TopicExchange appExchange() {
        return new TopicExchange(topicExchangeName);
    }

    @Bean
    public Binding petBinding(){
        return BindingBuilder
                .bind(petQueue())
                .to(appExchange())
                .with(petRoutingKey);
    }
}
