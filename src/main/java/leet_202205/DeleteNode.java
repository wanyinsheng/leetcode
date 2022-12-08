package leet_202205;

import leet_202203.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 * @Author wanys
 * @Date 2022/5/21 11:15 AM
 * @Version 1.0
 **/
public class DeleteNode {
    //给的是要删除的节点，因此要将，下一个节点的值，赋给当前节点，然后删除下一个节点
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;//指向下下个节点
    }

}
