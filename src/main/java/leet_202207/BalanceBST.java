package leet_202207;

import leet_202203.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/7/1 2:49 PM
 * @Version 1.0
 **/
public class BalanceBST {
    
    //中序遍历List
    List<Integer> inorderSeq = new ArrayList<Integer>();

    public TreeNode balanceBST(TreeNode root) {
        getInorder(root);
        //return helper(0, inorderSeq.size() - 1);
        return build(0, inorderSeq.size() - 1);
    }

    /**
     * 中序遍历放进list中
     *
     * @param o
     */
    public void getInorder(TreeNode o) {
        if (o.left != null) {
            getInorder(o.left);
        }
        inorderSeq.add(o.val);
        if (o.right != null) {
            getInorder(o.right);
        }
    }

    public TreeNode build(int l, int r) {
        int mid = (l + r) >> 1;
        TreeNode o = new TreeNode(inorderSeq.get(mid));
        if (l <= mid - 1) {
            o.left = build(l, mid - 1);
        }
        if (mid + 1 <= r) {
            o.right = build(mid + 1, r);
        }
        return o;
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid=(left+right)/2;
        //中序遍历的中间靠左的节点做为根
        TreeNode root = new TreeNode(nums[mid]);
        //递归左右子树
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }


}
