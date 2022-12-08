package leet_202207;

import java.util.HashMap;
import java.util.Map;

/**
 * 1995. 统计特殊四元组
 * @Author wanys
 * @Date 2022/7/4 10:46 上午
 * @Version 1.0
 **/
public class CountQuadruplets {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        //使用hashmap存储nums[d] - nums[c]
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int b = n - 3; b >= 1; --b) {
            for (int d = b + 2; d < n; ++d) {
                cnt.put(nums[d] - nums[b + 1], cnt.getOrDefault(nums[d] - nums[b + 1], 0) + 1);
            }
            for (int a = 0; a < b; ++a) {
                ans += cnt.getOrDefault(nums[a] + nums[b], 0);
            }
        }
        return ans;


    }
}
