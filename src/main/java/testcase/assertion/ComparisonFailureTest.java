package testcase.assertion;

import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ComparisonFailureTest {

    private String expected,actual,message;

    public ComparisonFailureTest(String expected, String actual, String message) {
        this.expected = expected;
        this.actual = actual;
        this.message = message;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"a","b", "expected:<[a]> but was:<[b]>"}
        });
    }

    @Test
    public void compactFailureMessage() {
        ComparisonFailure failure = new ComparisonFailure("", expected, actual);
        System.out.println(failure.getMessage());
        System.out.println(message);
        assertEquals(message, failure.getMessage());
    }

}
