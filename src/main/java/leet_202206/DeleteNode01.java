package leet_202206;

import leet_202203.ListNode;

/**
 * @Author wanys
 * @Date 2022/6/29 10:09 AM
 * @Version 1.0
 **/
public class DeleteNode01 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
