package junit4test.assertion;

import org.junit.Test;

public class BuyTest extends BaseTest{

    @Test
    public void buy() {
        if(map.get("status").equals("1")) {
            System.out.println("开始购物");
        } else {
            System.out.println("账户还未登录");
        }
    }
}
