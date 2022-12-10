package leet_202212;

import leet_202203.ListNode;

public class RemoveNodes {
	public ListNode removeNodes(ListNode head) {
		/**
		 * 递归
		 */
		if(head.next == null)//保证输入不为空
			return head;

		ListNode node = removeNodes(head.next);
		if(node.val >head.val)
			return node;//更新 了一下最大值，删除了head节点

		head.next=node;
		return head;
	}
}
