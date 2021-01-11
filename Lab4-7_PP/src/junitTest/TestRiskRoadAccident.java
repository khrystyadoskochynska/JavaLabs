package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;
import insurance.RisksCoef;

public class TestRiskRoadAccident {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Contract contract = new Contract();
		contract.addRisk(RisksCoef.roadAccident);

		System.out.println("######");

		System.out.println("Risk name from program : " + RisksCoef.roadAccident);
		System.out.println("Risk name from contract : " + contract.getRisks().get(0));
		System.out.println("Coeficient from program : " + RisksCoef.roadAccident.getCoef());
		System.out.println("Coeficient from contract : " + contract.getRisks().get(0).getCoef());
		assertEquals(RisksCoef.roadAccident, contract.getRisks().get(0));
		assertEquals(RisksCoef.roadAccident.getCoef(), contract.getRisks().get(0).getCoef(), 0.01);
	}

}
