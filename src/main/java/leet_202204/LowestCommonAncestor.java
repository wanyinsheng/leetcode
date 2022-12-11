package leet_202204;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/4/8 12:37 PM
 * @Version 1.0
 **/
public class LowestCommonAncestor {

    Map map = new HashMap<Integer, TreeNode>();//值-父节点
    Set visited = new HashSet<Integer>();


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //特殊情况判断
        if (root == null)
            return null;
        //先去沿着左右子树深度递归
        dfs(root);
        //一直向上将父节点标红
        while (p != null) {
            visited.add(p.val);//里边存放value
            p= (TreeNode) map.get(p.val);//找出其父节点
        }
        //然后拿着q去一一比较
        while(q!=null){
            if(visited.contains(q.val))
                return q;
            q= (TreeNode) map.get(q.val);

        }
        //没找到
        return null;
    }

    public void dfs(TreeNode root) {
        //沿着左子节点向下递归
        if (root.left != null) {
            map.put(root.left.val, root);
            dfs(root.left);
        }
        //沿着右子节点向下递归
        if (root.right != null) {
            map.put(root.right.val, root);
            dfs(root.right);
        }
    }
}
