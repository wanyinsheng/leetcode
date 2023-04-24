package leet_202304;

import leet_202203.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2023/4/24 15:27
 * @Version 1.0
 **/
public class PathSum {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<Integer>();
    /**
     * 深度优先搜索
     * 我们可以采用深度优先搜索的方式，枚举每一条从根节点到叶子节点的路径。当我们遍历到叶子节点，且此时路径和恰为目标和时，我们就找到了一条满足条件的路径。
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }
    public void dfs(TreeNode root, int targetSum) {
        if(root==null){
            return;
        }
        path.offerLast(root.val);//添加到栈顶（队尾）
        targetSum-=root.val;
        if(root.left == null && root.right == null && targetSum == 0){//叶子节点
            res.add(new LinkedList<>(path));//添加到结果集
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        //出栈
        path.pollLast();
    }
}
