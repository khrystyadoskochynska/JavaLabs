package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;
import insurance.RisksCoef;

public class TestRiskTheft {

	@Test
	public void test() {
		// fail("Not yet implemented");
		Contract contract = new Contract();
		contract.addRisk(RisksCoef.theft);

		System.out.println("######");

		System.out.println("Risk name from program : " + RisksCoef.theft);
		System.out.println("Risk name from contract : " + contract.getRisks().get(0));
		System.out.println("Coeficient from program : " + RisksCoef.theft.getCoef());
		System.out.println("Coeficient from contract : " + contract.getRisks().get(0).getCoef());
		assertEquals(RisksCoef.theft, contract.getRisks().get(0));
		assertEquals(RisksCoef.theft.getCoef(), contract.getRisks().get(0).getCoef(), 0.01);

	}

}
