package testcase.assertion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AdditionTest {

    // 初始化操作
    @Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {{0,0,0}, {1,1,2},
                {3,2,5}, {4,3,7}});
    }

    private int firstSummand;
    private int secondSummand;
    private int sum;

    public AdditionTest(int firstSummand, int secondSummand, int sum) {
        this.firstSummand = firstSummand;
        this.secondSummand = secondSummand;
        this.sum = sum;
    }

    @Test
    public void test() {
        assertEquals(sum, firstSummand+secondSummand);
    }

}
