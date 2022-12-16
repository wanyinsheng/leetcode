package leet_202212;

import leet_202203.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

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

	/**
	 * 使用中序遍历
	 * @param root
	 * @return
	 */
	public boolean isValidBST1(TreeNode root) {
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		double inorder = -Double.MAX_VALUE;//维护一个上一个中序遍历的节点值

		while (!stack.isEmpty() || root != null) {
			//先遍历到最左侧的叶子节点
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			// 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
			if (root.val <= inorder) {
				return false;
			}
			inorder = root.val;
			root = root.right;
		}
		return true;
	}


}
