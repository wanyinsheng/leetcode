package leet_202209;

import leet_202203.TreeNode;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author wanys
 * @Date 2022/9/13 23:49
 * @Version 1.0
 **/
public class PathSum {
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        int res = dfs(root, sum);
        //递归做左子树
        res += pathSum(root.left, sum);
        //递归右子树
        res += pathSum(root.right, sum);
        return res;
    }
    public int dfs(TreeNode root, int sum){
        int res=0;
        if(root==null){
            return 0;
        }
        int val=root.val;
        if(val==sum) {
            res++;
        }
        res += dfs(root.left, sum - val);
        res += dfs(root.right, sum - val);
        return res;
    }


}
