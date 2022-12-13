package leet_202212;

/**
 * 153. 寻找旋转排序数组中的最小值
 *
 * @Author wanys
 * @Date 2022/12/11 22:42
 * @Version 1.0
 **/
public class FindMin {
    /**
     * 二分查找
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while (low<high) {
            //int mid=(low+high)/2;
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {//忽略有半部分区间
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
