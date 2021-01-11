package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;
import insurance.RisksCoef;

public class TestRiskIatp {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Contract contract = new Contract();
		contract.addRisk(RisksCoef.iatp);

		System.out.println("######");

		System.out.println("Risk name from program : " + RisksCoef.iatp);
		System.out.println("Risk name from contract : " + contract.getRisks().get(0));
		System.out.println("Coeficient from program : " + RisksCoef.iatp.getCoef());
		System.out.println("Coeficient from contract : " + contract.getRisks().get(0).getCoef());
		assertEquals(RisksCoef.iatp, contract.getRisks().get(0));
		assertEquals(RisksCoef.iatp.getCoef(), contract.getRisks().get(0).getCoef(), 0.01);
	}

}
