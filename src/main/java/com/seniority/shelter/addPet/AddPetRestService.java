package com.seniority.shelter.addPet;

import com.seniority.shelter.addPet.request.AddPetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
@RequiredArgsConstructor
public class AddPetRestService {

    private final AddPetProducer addPetProducer;

    @PostMapping("/{shelterId}")
    @ResponseStatus(HttpStatus.OK)
    private void addPetToShelter(@PathVariable("shelterId") Long shelterId, @RequestBody AddPetRequest addPetRequest) {
        addPetProducer.produce(shelterId, addPetRequest);
    }
}
