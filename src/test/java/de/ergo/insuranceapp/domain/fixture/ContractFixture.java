package de.ergo.insuranceapp.domain.fixture;

import de.ergo.insuranceapp.domain.contract.Contract;
import de.ergo.insuranceapp.domain.contract.ContractId;
import de.ergo.insuranceapp.domain.insurance.InsuranceId;
import de.ergo.insuranceapp.domain.party.PartyId;

import java.util.UUID;

public class ContractFixture {
    public static Contract validContract(PartyId partyId, InsuranceId insuranceId) {
        return Contract.builder()
                .id(new ContractId(UUID.randomUUID()))
                .partyId(partyId)
                .insuranceId(insuranceId)
                .build();
    }
}
