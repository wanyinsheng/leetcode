package leet_202212;

import leet_202203.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 */
public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res =new ArrayList<List<Integer>>();
		if(root == null)
			return res;
		Queue<TreeNode> queue= new LinkedList<TreeNode>();
		//根节点先入队列
		queue.offer(root);
		while (!queue.isEmpty()) {
			//当前层的一个list集合
			List<Integer> list=new ArrayList<Integer>();
			int size = queue.size();//先判断该层有几个元素、
			for (int i = 0; i <size ; i++) {
				TreeNode node=queue.poll();
				//遍历一个，需要将当前节点放在队列里边
				list.add(node.val);
				//判断左右子节点是否为空，添加到队列
				if(node.left!=null){
					queue.offer(node.left);
				}
				if(node.right!=null){
					queue.offer(node.right);
				}
			}
			//一层遍历结束，添加到结果集
			res.add(list);
		}
		return res;
	}
}
