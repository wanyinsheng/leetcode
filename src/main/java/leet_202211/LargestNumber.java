package leet_202211;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/11/8 11:17
 * @Version 1.0
 **/
public class LargestNumber {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        //将数组转成包装类型
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }
        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });

        if (numsArr[0] == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();


    }
}
