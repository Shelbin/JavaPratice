package testng;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeSuite
    public void suiteInit() {
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void suiteEnd() {
        System.out.println("AfterSuite");
    }
    @BeforeClass
    public void classInit(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void classEnd(){
        System.out.println("AfterClass");
    }
    @BeforeTest
    public void testInit(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void testEnd(){
        System.out.println("AfterTest");
    }

    @DataProvider(name="testAddData")
    public Object[][] testAddData() {
        Object[][] data = new Object[][]{
                {1,1,2},
                {2,2,4},
                {3,3,6}
        };
        return data;
    }

    @DataProvider(name="testSubData")
    public Object[][] testSubData() {
        Object[][] data = new Object[][]{
                {1,1,0},
                {2,2,0},
                {3,3,0}
        };
        return data;
    }

    @Test(dataProvider = "testAddData")
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(expected, calculator.add(a,b));
    }

    @Test(dataProvider = "testSubData")
    public void testSub(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(a,b),expected);
    }


}
