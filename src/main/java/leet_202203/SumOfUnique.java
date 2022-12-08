package leet_202203;

import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/3/29 4:54 PM
 * @Version 1.0
 **/
public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                sum+=nums[i];
                map.put(nums[i],1);//第一次出现
            }else if(map.get(nums[i])==1){
                //不是第一次出现
                map.put(nums[i],2);//设置成2次就可以
                //将第一次加的和给减去
                sum-=nums[i];
            }
        }
        return sum;

    }
}
