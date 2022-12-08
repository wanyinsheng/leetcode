package leet_202205;

import java.util.LinkedList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 * @Author wanys
 * @Date 2022/5/21 2:38 PM
 * @Version 1.0
 **/
public class Postorder {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        helper(root,res);
        return res;

    }
    public void helper(Node root,List<Integer> res){
        if(root==null)
            return;
        for(Node node:root.children){
            helper(node,res);
        }
        res.add(root.val);
    }
}
