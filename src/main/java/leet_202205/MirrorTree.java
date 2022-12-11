package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/3 8:32 PM
 * @Version 1.0
 **/
public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
