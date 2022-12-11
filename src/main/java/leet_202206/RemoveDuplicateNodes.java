package leet_202206;

import leet_202203.ListNode;

import java.util.HashSet;

/**
 * @Author wanys
 * @Date 2022/6/30 5:24 PM
 * @Version 1.0
 **/
public class RemoveDuplicateNodes {


    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null)
            return head;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode cur=head;
        while(cur.next!=null){
            ListNode next = cur.next;
            if(set.add(next.val)){
                cur=cur.next;
            }else{
                cur.next=cur.next.next;
            }
        }
        cur.next=null;
        return head;
    }
}
