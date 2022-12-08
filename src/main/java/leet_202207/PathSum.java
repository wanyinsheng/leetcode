package leet_202207;

import leet_202203.TreeNode;

/**
 * 437. 路径总和 III
 * @Author wanys
 * @Date 2022/7/3 10:03 下午
 * @Version 1.0
 **/
public class PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        int res = rootSum(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;

    }
    public int rootSum(TreeNode root, int targetSum) {
        int sum=0;
        if(root==null)
            return 0;
        int val=root.val;
        if(val==targetSum){
            sum++;
        }
        //先去遍历左子树
        sum += rootSum(root.left, targetSum - val);
        //再去遍历右子树
        sum += rootSum(root.right, targetSum - val);
        return sum;

    }
}
