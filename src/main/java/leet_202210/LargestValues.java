package leet_202210;

import leet_202203.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/10/27 15:21
 * @Version 1.0
 **/
public class LargestValues {
    /**
     * 广度优先算法
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            int maxVal = Integer.MIN_VALUE;
            while (len > 0) {
                len--;
                TreeNode t = queue.poll();
                maxVal = Math.max(maxVal, t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            res.add(maxVal);
        }
        return res;
    }
}
