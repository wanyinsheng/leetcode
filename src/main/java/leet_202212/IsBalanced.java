package leet_202212;

import leet_202203.TreeNode;

/**
 * 110. 平衡二叉树
 */
public class IsBalanced {
	/**
	 * 自上而下的递归法
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		if(root==null)
			return true;
		return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left)  && isBalanced(root.right);//高度差为1 ，并且左右子树都是平衡的
	}

	/**
	 * 计算树的高度
	 * @param root
	 * @return
	 */
	public int height(TreeNode root){
		if(root==null){
			return 0;
		}else{
			return Math.max(height(root.left),height(root.right))+1;
		}

	}

}
