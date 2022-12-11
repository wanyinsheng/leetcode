package leet_202206;

import leet_202203.TreeNode;

/**
 * @Author wanys
 * @Date 2022/6/2 11:39 AM
 * @Version 1.0
 **/
public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if(root.val>key){
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        if(root.val==key){
            //是叶子节点，直接删除，返回空
            if (root.left == null && root.right == null) {
                return null;
            }
            //只有左子树，没有右子树，左子树作为新的子树
            if(root.right==null){
                return root.left;
            }
            //只有右子树，没有左子树，左子树作为新的子树
            if(root.left==null){
                return root.right;
            }
            //有左右子树，
            TreeNode next=root.right;
            while(next.left!=null){
                next=next.left;
            }
            root.right=deleteNode(root.right,next.val);
            next.right=root.right;
            next.left=root.left;
            return next;
        }
        return root;
    }

}
