package leet_202205;

/**
 * @Author wanys
 * @Date 2022/3/29 11:40 AM
 * @Version 1.0
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
