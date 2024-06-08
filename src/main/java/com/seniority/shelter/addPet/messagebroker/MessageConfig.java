package com.seniority.shelter.addPet.messagebroker;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class MessageConfig {

    @Value("${pet.exchange.name}")
    private String petExchangeName;

    @Value("${pet.queue.name}")
    private String petQueueName;

    @Value("${pet.routing.key}")
    private String petRoutingKey;

    @Bean
    public Queue petQueue() {
        return new Queue(petQueueName);
    }

    @Bean
    public TopicExchange petExchange() {
        return new TopicExchange(petExchangeName);
    }

    @Bean
    public Binding petBinding() {
        return BindingBuilder
                .bind(petQueue())
                .to(petExchange())
                .with(petRoutingKey);
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
