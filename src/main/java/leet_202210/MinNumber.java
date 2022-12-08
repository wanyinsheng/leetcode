package leet_202210;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/10/17 10:54
 * @Version 1.0
 **/
public class MinNumber {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> {
            return (x + y).compareTo(y + x);
        });
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }


}
