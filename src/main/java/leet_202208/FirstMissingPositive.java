package leet_202208;

/**
 * @Author wanys
 * @Date 2022/8/2 14:49
 * @Version 1.0
 **/
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //将负数改成n+1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;

    }
}
