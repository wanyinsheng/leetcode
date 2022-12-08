package leet_202207;

import java.util.*;

/**
 * 2215. 找出两数组的不同
 * @Author wanys
 * @Date 2022/7/1 3:13 PM
 * @Version 1.0
 **/
public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(find(nums1, nums2), find(nums2, nums1));
    }
    private List<Integer> find(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums2) {
            set.add(num);
        }

        Set<Integer> ans = new HashSet<>();
        for (int num : nums1) {
            if (!set.contains(num)) {
                ans.add(num);
            }
        }
        return new ArrayList<>(ans);//转化为 list
    }

}
