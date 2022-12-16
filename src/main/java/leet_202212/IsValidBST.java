package leet_202212;

import leet_202203.TreeNode;

/**
 * 98. 验证二叉搜索树
 */
public class IsValidBST {
	public boolean isValidBST(TreeNode root) {
		//根节点的区间范围是（-inf，+inf）
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

	}

	/**
	 * 每个节点是否在开区间的范围内
	 * @param node
	 * @param lower
	 * @param upper
	 * @return
	 */
	public boolean isValidBST(TreeNode node, long lower, long upper) {
		if (node == null) {
			return true;
		}
		if (node.val <= lower || node.val >= upper) {
			return false;
		}
		//左右节点子树的根节点是否在范围内
		return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
	}

}
