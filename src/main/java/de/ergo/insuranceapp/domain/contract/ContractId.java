package de.ergo.insuranceapp.domain.contract;

import lombok.Value;

import java.util.UUID;

@Value
public class ContractId {
    UUID raw;
}
