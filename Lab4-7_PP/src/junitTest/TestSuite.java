package junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestContractCost.class,
   TestUniqueID.class,
   TestRiskTheft.class,
   TestRiskIatp.class,
   TestRiskRoadAccident.class,
   TestRiskNaturalDisaster.class,
   TestRiskWithoutPolice.class
})

public class TestSuite {

}