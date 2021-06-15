package de.ergo.insuranceapp.domain;

import de.ergo.insuranceapp.domain.contract.Contract;
import de.ergo.insuranceapp.domain.contract.ContractId;
import de.ergo.insuranceapp.domain.insurance.Insurance;
import de.ergo.insuranceapp.domain.insurance.InsuranceId;
import de.ergo.insuranceapp.domain.party.Party;
import de.ergo.insuranceapp.domain.party.PartyId;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Component
public class InsuranceFacade {

    public void saveParty(Party party) {
    }

    public Party findParty(PartyId id) {
        throw new NotImplementedException();
    }

    public void saveInsurance(Insurance insurance) {
    }

    public Insurance findInsurance(InsuranceId id) {
        throw new NotImplementedException();
    }

    public void saveContract(Contract contract) {
    }

    public Contract findContract(ContractId id) {
        throw new NotImplementedException();
    }
}
