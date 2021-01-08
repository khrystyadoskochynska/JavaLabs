package junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestContractCost.class,
   TestUniqueID.class
})

public class TestSuite {

}