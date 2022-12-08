package leet_202210;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/10/19 22:39
 * @Version 1.0
 **/
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    public TreeNode helper(int[] nums, int left, int right) {
        //退出递归条件
        if (left > right) {
            return null;
        }
        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
