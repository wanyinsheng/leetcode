package leet_202206;

import leet_202203.ListNode;

/**
 * 面试题 02.04. 分割链表
 * @Author wanys
 * @Date 2022/6/14 10:50 PM
 * @Version 1.0
 **/
public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;


        ListNode large = new ListNode(0);
        ListNode largeHead = large;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;

    }
}
