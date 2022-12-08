package leet_202204;

import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/4/27 3:54 PM
 * @Version 1.0
 **/
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int pre=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i <nums.length ; i++) {
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
