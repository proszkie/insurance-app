package de.ergo.insuranceapp.domain;

import de.ergo.insuranceapp.domain.contract.Contract;
import de.ergo.insuranceapp.domain.fixture.ContractFixture;
import de.ergo.insuranceapp.domain.fixture.InsuranceFixture;
import de.ergo.insuranceapp.domain.fixture.PartyFixture;
import de.ergo.insuranceapp.domain.insurance.Insurance;
import de.ergo.insuranceapp.domain.insurance.InsuranceId;
import de.ergo.insuranceapp.domain.party.Party;
import de.ergo.insuranceapp.domain.party.PartyId;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.UUID;

@SpringBootTest
class InsuranceFacadeTest implements WithAssertions {

    @Autowired
    InsuranceFacade insuranceFacade;

    @Test
    void shouldBeAbleToCreateNewParty() {
        // Given
        Party party = PartyFixture.validParty();

        // When
        insuranceFacade.saveParty(party);

        // Then
        assertThat(insuranceFacade.findParty(party.getId())).isEqualTo(party);
    }

    @Test
    void shouldBeAbleToCreateNewInsurance() {
        // Given
        Insurance insurance = InsuranceFixture.validInsurance();

        // When
        insuranceFacade.saveInsurance(insurance);

        // Then
        assertThat(insuranceFacade.findInsurance(insurance.getId())).isEqualTo(insurance);
    }

    @Test
    void shouldBeAbleToCreateNewContract() {
        // Given
        Party party = PartyFixture.validParty();
        Insurance insurance = InsuranceFixture.validInsurance();
        insuranceFacade.saveParty(party);
        insuranceFacade.saveInsurance(insurance);

        //And
        Contract contract = ContractFixture.validContract(party.getId(), insurance.getId());

        // When
        insuranceFacade.saveContract(contract);

        // Then
        assertThat(insuranceFacade.findContract(contract.getId())).isEqualTo(contract);
    }

    @Test
    void shouldFailWhenCreatingInvalidContract() {
        // Given
        Contract contract = ContractFixture.validContract(new PartyId(UUID.randomUUID()), new InsuranceId(UUID.randomUUID()));

        // When - Then
        assertThatThrownBy(() -> insuranceFacade.saveContract(contract));
    }

    @Test
    void shouldRetrieveAllContractsStartingWithGivenDate() {
        // Given
        // When
        // Then
        throw new NotImplementedException();
    }
}