package testcase;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Junit4_02_Test {

    @Test(expected=IndexOutOfBoundsException.class)
    public void outofBounds() {
        new ArrayList<Object>().get(1);
    }

    @Test(timeout=100)
    public void infinity() {
        while(true);
    }

    @Test(timeout=100)
    public void sleep100() {
        try {
            Thread.sleep(99);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failWithNoMessageToString() {
        try {
            Assert.fail();
        } catch (AssertionError exception) {
            assertEquals("java.lang.AssertionError", exception.toString());
        }
    }
}
