package leet_202208;



import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/8/2 10:54
 * @Version 1.0
 **/
public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2)
            return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int remainder = 0;
        map.put(0,-1);
        //利用前缀和思想，如果sumq-sump是k的整数倍，则sump和sumq有相同的余数
        for (int i = 0; i < n; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);//余数作为key，
            }
        }
        return false;
    }
}
