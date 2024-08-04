package junit_4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Junit_Test1.class, Junit_Test2.class, Junit_Test3.class })
public class AllTests {

}
