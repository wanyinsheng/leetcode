package leet_202204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/4/1 5:52 PM
 * @Version 1.0
 **/
public class PairSums {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        //使用hashmap或者排序使用双指针
        ArrayList<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num:nums){
            if(map.get(target-num)>0){
                res.add(Arrays.asList(num, target-num));
                map.put(num,0);
            }
        }
        return  res;



    }
}
