package leet_202212;

/**
 * 33. 搜索旋转排序数组
 * @Author wanys
 * @Date 2022/12/11 22:43
 * @Version 1.0
 **/
public class Search {
    /**
     * 两次二分法
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        int n = nums.length;
        //考虑特殊情况
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        //定义上下界
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;


    }
}
