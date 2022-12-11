package leet_202205;

import java.util.ArrayList;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 * @Author wanys
 * @Date 2022/5/20 11:26 PM
 * @Version 1.0
 **/
public class TargetIndices {

    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int count=0,targetNum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<target){
                count++;
            }else if(nums[i]==target){
                targetNum++;
            }
        }
        //count也就是第一个target的索引
       while (targetNum-->0){
           list.add(count++);
       }
       return list;
    }

}
