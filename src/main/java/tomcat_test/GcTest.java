package tomcat_test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @Author wanys
 * @Date 2022/12/27 18:37
 * @Version 1.0
 **/
public class GcTest {
    private Queue objCache = new ConcurrentLinkedDeque<>();

    public  Greeting greeting() {
        Greeting greeting = new Greeting("Hello World!");
        //大于200000的时候才清空
        if (objCache.size() >= 200000) {
            objCache.clear();
        } else {
            objCache.add(greeting);
        }
        return greeting;
    }

    public static void main(String[] args) {
        GcTest gcTest = new GcTest();
        gcTest.greeting();
    }
}

@Data
@AllArgsConstructor
class Greeting {
    private String message;
}
