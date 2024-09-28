package com.seniority.shelter.addPet.messagebroker

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.TopicExchange
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
open class MessageConfig(val petProperties: PetProperties) {

    @Bean
    open fun petQueue(): Queue {
        return Queue(petProperties.queueName)
    }

    @Bean
    open fun petExchange(): TopicExchange {
        return TopicExchange(petProperties.exchangeName)
    }

    @Bean
    open fun petBinding(): Binding {
        return BindingBuilder
            .bind(petQueue())
            .to(petExchange())
            .with(petProperties.routingKey)
    }
}
