package de.ergo.insuranceapp.domain.party;

import lombok.Value;

import java.util.UUID;

@Value
public class PartyId {
    UUID raw;
}
