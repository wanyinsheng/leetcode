package leet_202207;

import leet_202203.TreeNode;

import java.util.Random;

/**
 * 108. 将有序数组转换为二叉搜索树
 * @Author wanys
 * @Date 2022/7/1 2:00 PM
 * @Version 1.0
 **/
public class SortedArrayToBST {

    Random rand = new Random();
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid=(left+right)/2;
        //中序遍历的中间靠左的节点做为根
        TreeNode root = new TreeNode(nums[mid]);
        //递归左右子树
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    public TreeNode helper1(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置右边的数字作为根节点
        int mid = (left + right + 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
    public TreeNode helper2(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 选择任意一个中间位置数字作为根节点（+0/+1）
        int mid = (left + right + rand.nextInt(2)) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }




}
