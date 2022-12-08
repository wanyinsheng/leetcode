package leet_202206;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/6/30 2:49 PM
 * @Version 1.0
 **/
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
