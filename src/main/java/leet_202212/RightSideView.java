package leet_202212;

import leet_202203.TreeNode;

import java.util.*;

/**
 * 199. 二叉树的右视图
 */
public class RightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
		int max_depth = -1;

		Queue<TreeNode> nodeQueue = new ArrayDeque<TreeNode>();
		Queue<Integer> depthQueue = new ArrayDeque<Integer>();
		nodeQueue.add(root);
		depthQueue.add(0);
		//层次遍历
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();
			int depth = depthQueue.remove();

			if (node != null) {
				// 维护二叉树的最大深度
				max_depth = Math.max(max_depth, depth);

				// 由于每一层最后一个访问到的节点才是我们要的答案，因此不断更新对应深度的信息即可
				rightmostValueAtDepth.put(depth, node.val);

				nodeQueue.add(node.left);
				nodeQueue.add(node.right);
				depthQueue.add(depth + 1);
				depthQueue.add(depth + 1);
			}
		}

		List<Integer> rightView = new ArrayList<Integer>();
		for (int depth = 0; depth <= max_depth; depth++) {
			rightView.add(rightmostValueAtDepth.get(depth));
		}

		return rightView;

	}

}
