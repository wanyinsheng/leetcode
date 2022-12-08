package leet_202210;

import leet_202203.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/10/16 17:42
 * @Version 1.0
 **/
public class IncreasingBST {
    /**
     * 中序遍历之后生成新的树
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root,res);

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode currNode=dummyNode;

        for(int num:res){
            //创建并指向右节点
            currNode.right=new TreeNode(num);
            //置右节点为当前节点
            currNode=currNode.right;
        }
        return dummyNode.right;
    }
    public void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }





    private TreeNode resNode;
    /**
     * 在中序遍历的过程中改变节点指向
     * @param root
     * @return
     */
    public TreeNode increasingBST1(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }
    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        // 在中序遍历的过程中修改节点指向
        resNode.right = node;
        node.left = null;//这里需要将原来节点node的左节点置为空
        resNode = node;
        inorder(node.right);
    }



}
