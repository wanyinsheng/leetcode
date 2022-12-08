package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/18 11:03
 * @Version 1.0
 **/
public class CountSubarrays {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int len = nums.length;
        long res = 0;
        int left = 0;
        int right = len - 1;
        //最大值和最小值的索引
        int minIndex = -1, maxIndex = -1;
        for (int i = 0; i < len; i++) {
            //找最大值和最小值下标
            if (nums[i] == minK) {
                minIndex = i;
            }
            if (nums[i] == maxK) {
                maxIndex = i;
            }
            //如果这个值影响了窗口的最大值或者最小值
            if (nums[i] < minK || nums[i] > maxK) {
                left = i + 1;//直接跳到left，左侧的都不符合
                minIndex = maxIndex = -1;//清空窗口标记
            }else if (minIndex != -1 && maxIndex != -1){
                int min = Math.min(minIndex, maxIndex);
                res += min - left + 1;
            }
        }
        return res;
    }

}
