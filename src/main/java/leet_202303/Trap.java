package leet_202303;

/**
 * @Author wanys
 * @Date 2023/3/7 15:03
 * @Version 1.0
 **/
public class Trap {
    /**
     * 双指针
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {//直到两指针相遇
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            //左边指针小，统计left处能接的水的量
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {//统计right处能接的水的量
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }
}
