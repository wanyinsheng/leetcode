package leet_202206;

import leet_202203.ListNode;

/**
 * 面试题 02.08. 环路检测
 * @Author wanys
 * @Date 2022/6/15 7:54 AM
 * @Version 1.0
 **/
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                ListNode node=head;
                while(node!=slow){
                    node=node.next;
                    slow=slow.next;
                }
                return slow;//return node;
            }
        }
        return null;
    }
}
