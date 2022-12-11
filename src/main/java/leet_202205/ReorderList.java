package leet_202205;

import leet_202203.ListNode;

/**
 * @Author wanys
 * @Date 2022/5/20 2:59 PM
 * @Version 1.0
 **/
public class ReorderList {

    public void reorderList(ListNode head) {
        if(head==null)
            return;
        ListNode mid=middleNode(head);
        ListNode l1=head;
        ListNode l2=mid.next;

        mid.next=null;
        //l2反转
        l2=reverseList(l2);
        //左右，左右的顺序进行归并
        mergeList(l1,l2);

    }

    /**
     * 求链表的中间节点，如果是偶数个，返回第二个，这里使用快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public void mergeList(ListNode l1, ListNode l2) {
        ListNode l1next=l1;
        ListNode l2next=l2;
        while(l1!=null||l2!=null){
            l1next=l1.next;
            l2next=l2.next;
            l1.next=l2;
            l2.next=l1next;
            l1.next=l1next;
            l2.next=l2next;

        }
    }




}
