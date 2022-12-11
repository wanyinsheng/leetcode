package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 2:19 PM
 * @Version 1.0
 **/
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        //双指针，快慢指针
        int slow = 2;
        int fast = 2;
        while (fast < n) {
            //最多保留两个，因此这里使用slow-2
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
