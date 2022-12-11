package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/28 9:25 PM
 * @Version 1.0
 **/
public class OddEvenList {

    public static void main(String[] args) {

    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //奇数链表的头节点
        ListNode oddHead=head;
        //偶数链表的头节点
        ListNode evenHead=head.next;

        //定义奇数偶数链表的当前节点
        ListNode oddCurr=oddHead;
        ListNode evenCurr=evenHead;

        while( oddCurr.next.next!=null||evenCurr.next.next!=null){
            oddCurr.next=oddCurr.next.next;
            evenCurr.next=evenCurr.next.next;
            //往后移动
            oddCurr=oddCurr.next;
            evenCurr=evenCurr.next;
        }
        //将奇偶链表连起来
        oddCurr.next=evenHead;
        return oddHead;
    }

}
