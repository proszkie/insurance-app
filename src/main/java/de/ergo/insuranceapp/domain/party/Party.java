package de.ergo.insuranceapp.domain.party;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Party {
    PartyId id;
    String firstName;
    String lastName;
}
