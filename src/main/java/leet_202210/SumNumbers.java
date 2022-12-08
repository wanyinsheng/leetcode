package leet_202210;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/10/28 09:32
 * @Version 1.0
 **/
public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int preSum){
        if(root==null){
            return 0;
        }
        int sum = preSum * 10 + root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }else{
            return dfs(root.left,sum)+dfs(root.right,sum);
        }

    }
}
