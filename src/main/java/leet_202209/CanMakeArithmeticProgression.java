package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/5 10:01
 * @Version 1.0
 **/
public class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; ++i) {
            if (arr[i] * 2 != arr[i - 1] + arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
