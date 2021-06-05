package ro.ase.cts.Suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.Categories.TesteRight;
import ro.ase.cts.Categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses(CompleteTestSuite.class) // nu este recomandat
@Categories.IncludeCategory(TesteUrgente.class)
@Categories.ExcludeCategory(TesteRight.class)
public class CustomSuite {

}
