package leet_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/7/1 2:54 PM
 * @Version 1.0
 **/
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            //先判断3在判断5，就会判断3和5，
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        return answer;
    }
}
