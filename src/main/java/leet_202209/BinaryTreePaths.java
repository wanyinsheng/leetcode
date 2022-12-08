package leet_202209;

import leet_202203.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/9/13 23:38
 * @Version 1.0
 **/
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        dfs(root, "", paths);
        return paths;
    }
    public void dfs(TreeNode root, String path,List<String> paths){
        if(root != null){
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(String.valueOf(root.val));
            if(root.left == null&&root.right == null){//如果是叶子节点
                //添加到list
                paths.add(pathSB.toString());
            }else{//非叶子节点，继续递归遍历
                pathSB.append("->");
                dfs(root.left, pathSB.toString(), paths);
                dfs(root.left, pathSB.toString(), paths);

            }
        }
    }
}
