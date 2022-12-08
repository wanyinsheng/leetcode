package leet_202210;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/10/18 10:02
 * @Version 1.0
 **/
public class FindMaxK {
    public int findMaxK(int[] nums) {
        //维护一个最大值
        int max=-1;
        Set<Integer> set =new HashSet<>();
        for(int num : nums){
            int n=Math.abs(num);
            if(set.contains(-num)&&max<n){
                max=n;
            }
            set.add(num);
        }
        return max;
    }
}
