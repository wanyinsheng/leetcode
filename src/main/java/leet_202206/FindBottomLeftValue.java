package leet_202206;

import leet_202203.TreeNode;

/**
 * 剑指 Offer II 045. 二叉树最底层最左边的值
 * @Author wanys
 * @Date 2022/6/30 3:08 PM
 * @Version 1.0
 **/
public class FindBottomLeftValue {

    int curHeight=0;
    int curVal=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return curVal;
    }
    public void dfs(TreeNode root, int height){
        if(root==null)
            return;
        height++;
        dfs(root.left,height);
        dfs(root.right,height);
        if(height>curHeight){
            curHeight=height;
            curVal=root.val;
        }
    }


}
