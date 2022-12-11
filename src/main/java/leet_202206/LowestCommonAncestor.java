package leet_202206;

import leet_202203.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * @Author wanys
 * @Date 2022/6/7 10:41 AM
 * @Version 1.0
 **/
public class LowestCommonAncestor {

    //保存父节点
    HashMap<Integer, TreeNode> parent = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        dfs(root);
        while(p!=null){
            visited.add(p.val);
            p=parent.get(p.val);
        }
        while(q!=null){
            if(visited.contains(q.val)){
                return q;
            }
            q=parent.get(q.val);
        }
        return null;

    }
    public void dfs(TreeNode root){
        if(root.left!=null){
            parent.put(root.left.val,root);
            dfs(root.left);
        }
        if(root.right!=null){
            parent.put(root.right.val,root);
            dfs(root.right);
        }

    }
}
