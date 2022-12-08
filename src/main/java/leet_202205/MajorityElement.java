package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/21 10:00 AM
 * @Version 1.0
 **/
public class MajorityElement {
    /**
     * Boyer-Moore 投票算法
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int num : nums) {
            //考虑更新候选值
            if (count == 0) {
                candidate = num;
            }
            //次数是在这里加的，上边只考虑了更新候选值
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        //以上的统计只能计算出可能是多数元素，（只有是候选值了，才可能成为多数元素）
        //遍历一下统计个数
        int len=nums.length;
        for(int num:nums){
            if(candidate==num)
                count++;
        }
        return count*2>len?candidate:-1;
    }
}
