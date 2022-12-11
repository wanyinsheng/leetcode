package leet_202203;


import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/3/29 11:19 AM
 * @Version 1.0
 **/
public class FindTarget {

    /**
     * 使用深度遍历加hash表
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return (findTarget(root.left, k) || findTarget(root.right, k));
    }

    /**
     * 层次遍历
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget1(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //根节点先入队列
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (set.contains(k - node.val)) {
                return true;
            }
            set.add(node.val);
            if (node.left != null) {
                queue.offer(root.left);
            }
            if (node.right != null) {
                queue.offer(root.right);
            }
        }
        return false;
    }

}
