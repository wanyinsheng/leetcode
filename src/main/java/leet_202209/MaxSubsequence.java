package leet_202209;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/9/5 10:16
 * @Version 1.0
 **/
public class MaxSubsequence {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[]  arr = Arrays.copyOf(nums, n);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int[] ans = new int[k];
        int index = 0;
        //取前k个
        for (int i = 0; i < n; i++) {
            //获取对应下标元素
            for (int j = n-k; j<n ; j++) {
                if(arr[i]==nums[j]) {
                    ans[index++] = arr[i];
                }
            }

        }
        return ans;
    }
}
