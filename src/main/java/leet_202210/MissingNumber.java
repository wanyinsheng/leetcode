package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/15 16:08
 * @Version 1.0
 **/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //判断数字是否在正确的索引上
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                //前边都正确
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }



}
