package testcase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 此处类的配置顺序会影响执行顺序
         */
        LoginTest.class,
        BuyTest.class
})

public class JunitSuite {

}
