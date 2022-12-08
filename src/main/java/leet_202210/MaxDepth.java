package leet_202210;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/10/15 16:19
 * @Version 1.0
 **/
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        //递归实现树的深度
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight)+1;
        }
    }
}
