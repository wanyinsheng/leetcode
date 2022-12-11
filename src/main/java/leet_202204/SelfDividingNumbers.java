package leet_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/4/1 4:18 PM
 * @Version 1.0
 **/
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {


            if (isSelfDividingNumber(i)==true)
                list.add(i);
        }
        return list;
    }

    public boolean isSelfDividingNumber(int x) {
        int num = x;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || x % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
