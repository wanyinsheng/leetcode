package leet_202304;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2023/4/24 16:03
 * @Version 1.0
 **/
public class CountNodes {
    /**
     * 根据完全二叉树的特性可知，完全二叉树的最左边的节点一定位于最底层，
     * 因此从根节点出发，每次访问左子节点，直到遇到叶子节点，该叶子节点即为完全二叉树的最左边的节点，
     * 经过的路径长度即为最大层数h
     * <p>
     * 根节点位于第0层
     * <p>
     * 等比数列求和
     * <p>
     * 根据节点个数范围的上下界得到当前需要判断的节点个数k，
     * 如果第k 个节点存在，则节点个数一定大于或等于k，
     * 如果第k 个节点不存在，则节点个数一定小于 k，
     * 由此可以将查找的范围缩小一半，直到得到节点个数。
     * <p>
     * <p>
     * 如何判断第  k 个节点是否存在呢？
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        TreeNode node = root;
        //一直遍历左节点计算最大层数level
        while (node.left != null) {
            level++;
            node = node.left;
        }
        //第level层的范围
        int low = 1 << level, high = (1 << (level + 1)) - 1;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (exists(root, level, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    //节点k是否存在
    public boolean exists(TreeNode root, int level, int k) {
        int bits = 1 << (level - 1);
        TreeNode node = root;
        while (node != null && bits > 0) {
            if ((bits & k) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            bits >>= 1;
        }
        return node != null;
    }

}
