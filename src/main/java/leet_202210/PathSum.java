package leet_202210;

import leet_202203.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/10/17 15:34
 * @Version 1.0
 **/
public class PathSum {
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    // 双端队列代替栈
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return ret;
    }

    /**
     * 深度优先遍历
     *
     * @param root
     * @param target
     */
    public void dfs(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        //当前节点入栈
        path.offerLast(root.val);
        target -= root.val;
        //必须要遍历到根节点
        if (root.left == null && root.right == null && target == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        //当前节点遍历完了，需要出栈，栈顶元素弹出
        path.pollLast();
    }


}
