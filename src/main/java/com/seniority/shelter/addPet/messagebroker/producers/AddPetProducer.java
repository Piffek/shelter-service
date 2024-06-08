package com.seniority.shelter.addPet.messagebroker.producers;

import com.seniority.shelter.addPet.request.AddPetRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.shelter.commands.AddPetCommand;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class AddPetProducer {

    @Value("${pet.exchange.name}")
    private String topicExchangeName;

    @Value("${pet.routing.key}")
    private String petRoutingKey;

    private final RabbitTemplate rabbitTemplate;

    public void produce(Long shelterId, AddPetRequest addPetRequest) {
        log.info("Add pet to shelter...");
        var command = new AddPetCommand(addPetRequest.getName(), addPetRequest.getFoundCity(), shelterId);
        rabbitTemplate.convertAndSend(topicExchangeName, petRoutingKey, command);
    }
}
