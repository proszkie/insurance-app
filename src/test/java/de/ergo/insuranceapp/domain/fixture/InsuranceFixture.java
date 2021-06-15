package de.ergo.insuranceapp.domain.fixture;

import de.ergo.insuranceapp.domain.insurance.Insurance;
import de.ergo.insuranceapp.domain.insurance.InsuranceDetails;
import de.ergo.insuranceapp.domain.insurance.InsuranceId;
import de.ergo.insuranceapp.domain.insurance.InsuranceType;

import java.math.BigDecimal;
import java.util.UUID;

public class InsuranceFixture {

    public static Insurance validInsurance() {
        return Insurance.builder()
                .id(new InsuranceId(UUID.randomUUID()))
                .details(InsuranceDetails.builder()
                        .name("Test insurance")
                        .price(BigDecimal.valueOf(10))
                        .type(InsuranceType.GROUP_CONTRACT)
                        .build())
                .build();
    }
}
