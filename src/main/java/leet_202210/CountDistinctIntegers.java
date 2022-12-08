package leet_202210;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/10/18 10:20
 * @Version 1.0
 **/
public class CountDistinctIntegers {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            String cur = new StringBuilder("" + num).reverse().toString();
            int reverseNum = Integer.parseInt(cur);
            set.add(reverseNum);
        }
        return set.size();
    }
}
