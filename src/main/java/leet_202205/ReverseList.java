package leet_202205;

import leet_202203.ListNode;

/**
 * @Author wanys
 * @Date 2022/5/20 3:10 PM
 * @Version 1.0
 **/
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode pre=null;
        ListNode next=head;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return head;
    }
}
