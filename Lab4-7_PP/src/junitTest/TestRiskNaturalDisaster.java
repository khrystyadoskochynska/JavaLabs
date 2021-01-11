package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;
import insurance.RisksCoef;

public class TestRiskNaturalDisaster {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Contract contract = new Contract();
		contract.addRisk(RisksCoef.naturalDisaster);

		System.out.println("######");

		System.out.println("Risk name from program : " + RisksCoef.naturalDisaster);
		System.out.println("Risk name from contract : " + contract.getRisks().get(0));
		System.out.println("Coeficient from program : " + RisksCoef.naturalDisaster.getCoef());
		System.out.println("Coeficient from contract : " + contract.getRisks().get(0).getCoef());
		assertEquals(RisksCoef.naturalDisaster, contract.getRisks().get(0));
		assertEquals(RisksCoef.naturalDisaster.getCoef(), contract.getRisks().get(0).getCoef(), 0.01);

	}

}
