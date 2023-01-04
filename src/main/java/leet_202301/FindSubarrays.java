package leet_202301;

import java.util.HashSet;
import java.util.Set;

/**
 * 2395. 和相等的子数组
 * @Author wanys
 * @Date 2023/1/4 21:12
 * @Version 1.0
 **/
public class FindSubarrays {
    public boolean findSubarrays(int[] nums) {
        // 统计相邻数字的和，加入哈希表中（去重），如果去重后不足 n−1 个，则子数组存在。
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <nums.length-1 ; i++) {
            set.add(nums[i]+nums[i+1]);

        }
        return set.size()!= nums.length-1;
    }
}
