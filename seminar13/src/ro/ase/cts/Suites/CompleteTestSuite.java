package ro.ase.cts.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.Teste.GrupaTest;
import ro.ase.cts.Teste.GrupaTestWithMocks;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithMocks.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {

}
