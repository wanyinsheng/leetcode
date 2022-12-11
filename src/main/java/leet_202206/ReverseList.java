package leet_202206;

import leet_202203.ListNode;

/**
 * @Author wanys
 * @Date 2022/6/30 2:26 PM
 * @Version 1.0
 **/
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
