package leet_202205;

/**
 * 563. 二叉树的坡度
 * @Author wanys
 * @Date 2022/5/21 9:33 AM
 * @Version 1.0
 **/
public class FindTilt {
    int ans = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sumLeft = dfs(node.left);
        int sumRight = dfs(node.right);
        ans += Math.abs(sumLeft - sumRight);
        return sumLeft + sumRight + node.val;
    }


}
