package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;
import insurance.RisksCoef;

public class TestContractCost {

	@Test
	public void testCost() {
		//fail("Not yet implemented");
		System.out.println("#######");

		Contract contract = new Contract();
		contract.setClientName("Tina");
		contract.addRisk(RisksCoef.theft);
		contract.addRisk(RisksCoef.iatp);
		contract.addRisk(RisksCoef.roadAccident);
		contract.addRisk(RisksCoef.naturalDisaster);
		contract.addRisk(RisksCoef.withoutPolice);
		contract.setInsuranceCoverage(500000);
		contract.calculateCoeficient();
		contract.calculateCost();
		System.out.println("Contract cost: " + contract.getInsuranceCost());
		
		double testCoef = 3.8*1.1*1.23*1.15*1.05;
		double testCost = 500000*testCoef/100;
		System.out.println("Calculated cost by test: "+testCost);
		//double result = contract.getInsuranceCost();
		assertEquals(testCost, contract.getInsuranceCost(),0.01);
		//assertEquals(500000,contract.getInsuranceCoverage(),0.1);
		//assertEquals("Tina",contract.getClientName());
		
	}

}
