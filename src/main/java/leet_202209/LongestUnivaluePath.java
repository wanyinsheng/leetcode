package leet_202209;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/9/13 23:26
 * @Version 1.0
 **/
public class LongestUnivaluePath {
    int res=0;
    public int longestUnivaluePath(TreeNode root) {
        //DFS深度优先
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        int left1=0;
        int right1=0;
        if(root.left!=null&&root.left.val==root.val ){
            left1=left+1;
        }
        if(root.right!=null&&root.right.val==root.val ){
            right1=right+1;
        }
        //更新result
        res=Math.max(res,left1+right1);
        //返回根节点开始的最大长度，只能取一边的
        return Math.max(left1,right1);



    }
}
