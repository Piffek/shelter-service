package com.seniority.shelter.addPet;

import com.seniority.shelter.addPet.command.AddPetCommand;
import com.seniority.shelter.addPet.request.AddPetRequest;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
@Log4j2
@RequiredArgsConstructor
public class AddPetProducer {

    @Value("${topic.exchange.name}")
    private String topicExchangeName;

    @Value("${pet.routing.key}")
    private String petRoutingKey;

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void produce(int shelterId, AddPetRequest addPetRequest) {
        log.info("Add pet to shelter...");
        var command = new AddPetCommand(addPetRequest.getName(), addPetRequest.getFoundCity(), shelterId);
        rabbitTemplate.convertAndSend(topicExchangeName, petRoutingKey, command);
    }

}
