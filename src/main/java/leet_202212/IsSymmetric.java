package leet_202212;

import leet_202203.TreeNode;

/**
 * 101. 对称二叉树
 */
public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		return check(root,root);
	}
	public boolean check(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
	}

}
