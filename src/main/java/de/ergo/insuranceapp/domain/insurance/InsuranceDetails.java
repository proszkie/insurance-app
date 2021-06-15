package de.ergo.insuranceapp.domain.insurance;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class InsuranceDetails {
    String name;
    BigDecimal price;
    InsuranceType type;
}
