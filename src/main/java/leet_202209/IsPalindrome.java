package leet_202209;

import leet_202203.ListNode;

import java.util.Stack;

/**
 * @Author wanys
 * @Date 2022/9/13 19:56
 * @Version 1.0
 **/
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        //找到中间节点(前半部分的尾结点)
        ListNode leftTail = endOfFirstHalf(head);
        //反转后半部分
        ListNode rightNewHead = reverseList(leftTail.next);
        ListNode p1=head;
        ListNode p2=rightNewHead;
        boolean result=true;
        while(p1!=null&&p2!=null){
            if(p1.val!=p2.val){
                result=false;
                break;//提前终止循环，或者直接return false
            }
            p1=p1.next;
            p2=p2.next;
        }
        //将有半部分反转的链表反转回来
        leftTail.next=reverseList(rightNewHead);
        return result;

    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null ){
            ListNode next=cur.next;
            cur.next = prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    private ListNode endOfFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
