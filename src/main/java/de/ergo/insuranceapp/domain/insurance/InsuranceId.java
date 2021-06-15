package de.ergo.insuranceapp.domain.insurance;

import lombok.Value;

import java.util.UUID;

@Value
public class InsuranceId {
    UUID raw;
}
