package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 9:30 AM
 * @Version 1.0
 **/
public class SortList {

    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }
    public ListNode sortList(ListNode head, ListNode tail) {
        if(head==null){
            return head;
        }
        if(head.next==tail){
            head.next=null;
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=tail){
            slow=slow.next;
            fast=fast.next;//先移动一步
            //判断是否可以在移动，
            if(fast!=null){
                fast=fast.next;//再移动一步
            }
        }
        ListNode mid=slow;
        ListNode list1=sortList(head,mid);
        ListNode list2=sortList(mid,tail);
        ListNode merged=merge(list1,list2);
        return merged;
    }
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode temp=dummyHead;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;

        }
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        return dummyHead.next;

    }
}
