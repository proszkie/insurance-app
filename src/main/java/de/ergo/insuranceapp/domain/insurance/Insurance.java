package de.ergo.insuranceapp.domain.insurance;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Insurance {
    InsuranceId id;
    String name;
    InsuranceDetails details;
}
