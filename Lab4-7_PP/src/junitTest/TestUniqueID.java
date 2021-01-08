package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import contracts.Contract;

public class TestUniqueID {


	@Test
	public void testUniqueID() {
		//fail("Not yet implemented");
		System.out.println("#######");
		System.out.println("Test unique contract ID:");
		Contract contract1 = new Contract();
		Contract contract2 = new Contract();

		assertTrue(contract1.getID() != contract2.getID());
		
	}

}
