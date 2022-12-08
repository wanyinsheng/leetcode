package leet_202210;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/10/16 17:36
 * @Version 1.0
 **/
public class MinDiffInBST {
    int pre;
    int ans;
    /**
     * 中序遍历
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        ans=Integer.MAX_VALUE;
        pre=-1;
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode root){
        if(root == null){
            return ;
        }
        dfs(root.left);
        //首次初始化前驱节点值
        if(pre == -1){
            pre=root.val;
        }else{
            ans=Math.min(ans,root.val-pre);//因为是递增的
            pre=root.val;
        }
        dfs(root.right);
    }
}
