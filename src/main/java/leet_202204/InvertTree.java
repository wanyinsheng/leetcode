package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/8 12:55 PM
 * @Version 1.0
 **/
public class InvertTree {

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        //分别取反转左右子树
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        //交换左右子树
        root.left = right;
        root.right = left;
        return root;
    }
}
