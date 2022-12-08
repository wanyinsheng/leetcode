package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/15 15:46
 * @Version 1.0
 **/
public class Search {
    public int search(int[] nums, int target) {
        int firstK = getFirstK(nums, target, 0, nums.length - 1);
        int lastK = getLastK(nums, target, 0, nums.length - 1);
        System.out.println(firstK + " " + lastK);
        return firstK > -1 && lastK > -1 ? lastK - firstK + 1 : 0;


    }

    public int getFirstK(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            if (mid > 0 && nums[mid - 1] != target || mid == 0) {
                return mid;
            } else {
                end = mid - 1;
            }

        } else if (nums[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

        return getFirstK(nums, target, start, end);
    }

    public int getLastK(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (nums[mid] == target) {
            if (mid < nums.length - 1 && nums[mid + 1] != target || mid == nums.length - 1) {
                return mid;
            } else {
                start = mid + 1;
            }

        } else if (nums[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return getLastK(nums, target, start, end);
    }
}
