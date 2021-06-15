package de.ergo.insuranceapp.domain.fixture;

import de.ergo.insuranceapp.domain.party.Party;
import de.ergo.insuranceapp.domain.party.PartyId;

import java.util.UUID;

public class PartyFixture {
    public static Party validParty() {
        return Party.builder()
                .id(new PartyId(UUID.randomUUID()))
                .firstName("first")
                .lastName("name")
                .build();
    }
}
