package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/25 1:09 AM
 * @Version 1.0
 **/
public class MyLinkedList {

    private ListNode dummy;
    private int count;
    public MyLinkedList() {
        dummy=new ListNode(0);
        count=0;
    }

    public int get(int index) {
        if(index<0||index>=count)
            return -1;
        ListNode curr=dummy.next;
        while(index-- > 0){
            curr=curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(count,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>count){
            return;
        }
        ListNode pre=dummy;
        while (index-- >0){
            pre=pre.next;
        }
        pre.next=new ListNode(val,pre.next);
        count++;
    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=count)
            return;
        ListNode pre=dummy;
        while(index-- >0){
            pre=pre.next;
        }
        ListNode t=pre.next;
        pre.next=t.next;
        t.next=null;
        count--;
    }
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this(val,null);
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
}
