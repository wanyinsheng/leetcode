package leet_202207;

import java.util.HashSet;

/**
 * 128. 最长连续序列
 * @Author wanys
 * @Date 2022/7/1 11:03 AM
 * @Version 1.0
 **/
public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //先将所有的数添加到set中
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for (int num:set){
            //不包含前一个数，才会做为一个新的头去遍历
            if(!set.contains(num-1)){
                int curNum=num;
                int curMax=1;
                //一直往后遍历
                while(set.contains(curNum+1)){
                    curNum+=1;
                    curMax+=1;
                }
                //更新最大长度
                max=Math.max(max,curMax);
            }

        }
        return max;

    }
}
