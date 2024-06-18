package com.seniority.shelter.addPet.messagebroker.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AddPetCommand {
    private final String name;
    private final String foundCity;
    private final Long shelterId;
}
