package leet_202206;

import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/6/30 2:54 PM
 * @Version 1.0
 **/
public class FindMaxLength {

    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        map.put(counter, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                counter++;
            } else {
                counter--;
            }
            if (map.containsKey(counter)) {
                int prevIndex = map.get(counter);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(counter, i);
            }
        }
        return maxLen;
    }
}
