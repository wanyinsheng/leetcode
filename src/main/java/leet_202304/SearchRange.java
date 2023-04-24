package leet_202304;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * @Author wanys
 * @Date 2023/4/24 10:57
 * @Version 1.0
 **/
public class SearchRange {
    //非递减数列
    public int[] searchRange(int[] nums, int target) {
        //找第一个大于等于(第一个等于 target 的位置)
        int leftIndex = binarySearch(nums, target, true);
        //第一个大于 target 的位置减一
        int rightIndex = binarySearch(nums, target, false) - 1;
        if(leftIndex<=rightIndex&&rightIndex<nums.length&&nums[leftIndex] == target && nums[rightIndex] == target) {
            return new int[]{leftIndex, rightIndex};
        }
        return new int[]{-1,-1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;
        while (left <= right) {
            int mid = left+(right-left) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;//更新中间值
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
