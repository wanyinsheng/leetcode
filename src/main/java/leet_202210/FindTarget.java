package leet_202210;

import leet_202203.TreeNode;

import java.util.*;

/**
 * @Author wanys
 * @Date 2022/10/16 17:04
 * @Version 1.0
 **/
public class FindTarget {
    Set<Integer> set = new HashSet<Integer>();

    /**
     * 深度优先遍历加哈希表
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) {
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        //当前节点值添加到集合
        set.add(root.val);
        //递归遍历左右子树
        return findTarget(root.left,k)||findTarget(root.right,k);
    }

    /**
     * 广度优先遍历加哈希表
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget1(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        //根节点入队列
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(set.contains(k-node.val)){
                return true;
            }
            set.add(node.val);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return false;
    }




    List<Integer> list = new ArrayList<Integer>();
    /**
     * 深度优先搜索 + 中序遍历 + 双指针
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget2(TreeNode root, int k) {
        inorderTraversal(root);
        int left=0;
        int right=list.size()-1;
        while(left<right){
            if(list.get(left)+list.get(right)==k){
                return true;
            }else if(list.get(left)+list.get(right)<k){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        list.add(node.val);
        inorderTraversal(node.right);
    }



}
