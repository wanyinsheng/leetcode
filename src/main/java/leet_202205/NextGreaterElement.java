package leet_202205;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/5/25 1:24 AM
 * @Version 1.0
 **/
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int n = nums1.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;

    }
}
