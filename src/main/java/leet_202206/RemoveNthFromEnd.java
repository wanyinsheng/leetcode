package leet_202206;

import leet_202203.ListNode;

/**
 * 剑指 Offer II 021. 删除链表的倒数第 n 个结点
 * @Author wanys
 * @Date 2022/6/30 3:40 PM
 * @Version 1.0
 **/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        int length = getLen(head);
        ListNode cur = dummy;
        for (int i = 0; i < length - n ; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;//将倒数第n个节点删除了
        ListNode ans = dummy.next;
        return ans;



    }
    public int getLen(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
