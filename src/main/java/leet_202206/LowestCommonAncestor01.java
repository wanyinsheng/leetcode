package leet_202206;

import jdk.nashorn.internal.ir.CallNode;
import leet_202203.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author wanys
 * @Date 2022/6/30 5:37 PM
 * @Version 1.0
 **/
public class LowestCommonAncestor01 {


    HashMap<Integer, TreeNode> parent = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //已经将父节点添加到了map中
        dfs(root);
        while(p!=null){
            visited.add(p.val);
            p=parent.get(p.val);//获取父节点，继续要标记为已经访问
        }
        while(q!=null){
            if(visited.contains(q.val)){
                return q;
            }
            q=parent.get(q.val);
        }
        //没有公共节点
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
