package leet_202210;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/10/15 16:39
 * @Version 1.0
 **/
public class KthLargest {
    int count = 0;
    int res = 0;

    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    public void dfs(TreeNode root, int k) {
        if(root==null) return;
        //先遍历右子树
        dfs(root.right, k);
        //提前返回   的条件
        if (count == k)
            return;
        count++;
        if (count == k)
            res = root.val;
        //遍历左子树
        dfs(root.left, k);
    }
}
