package junit4test.assertion;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void login() {
        map.put("9","o");
        map.put("username","张三");
        System.out.println(map);
        System.out.println(map.get("username"));

        if (map.get("username").equals("张三")) {
            System.out.println("账户登录成功！ GO! GO! GO!");
            map.put("status","1");
        }
        System.out.println(map);
    }
}
