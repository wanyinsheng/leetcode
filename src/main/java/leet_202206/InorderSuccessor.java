package leet_202206;

import leet_202203.TreeNode;

import java.util.ArrayDeque;

/**
 * 剑指 Offer II 053. 二叉搜索树中的中序后继
 * @Author wanys
 * @Date 2022/6/2 10:17 AM
 * @Version 1.0
 **/
public class InorderSuccessor {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode pre=null;
        TreeNode cur=root;
        //保存中序遍历的上一个节点和当前节点，入过上一个节点是p，那就返回当前节点，入过p是最后一个节点，那就返回null
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            //判断上一个节点是否是p
            if(pre==p){
                return cur;
            }
            //去右节点
            pre=cur;
            cur=cur.right;

        }
        return  null;

    }
}
