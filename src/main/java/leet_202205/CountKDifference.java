package leet_202205;

import java.util.HashMap;

/**
 * 2006. 差的绝对值为 K 的数对数目
 * @Author wanys
 * @Date 2022/5/21 1:25 PM
 * @Version 1.0
 **/
public class CountKDifference {

    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            //先从map中获取，就保证了i<j,因为i在之前已经背put进去了
            count+=map.getOrDefault(num-k,0)+map.getOrDefault(num+k,0);

            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;


    }

}
