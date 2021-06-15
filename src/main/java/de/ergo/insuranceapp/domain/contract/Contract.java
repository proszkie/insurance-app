package de.ergo.insuranceapp.domain.contract;

import de.ergo.insuranceapp.domain.insurance.InsuranceId;
import de.ergo.insuranceapp.domain.party.PartyId;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class Contract {
    ContractId id;
    PartyId partyId;
    InsuranceId insuranceId;
    Instant startDate;
    Instant endDate;
}
