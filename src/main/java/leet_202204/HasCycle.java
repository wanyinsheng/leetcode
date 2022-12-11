package leet_202204;


/**
 * @Author wanys
 * @Date 2022/4/24 11:07 AM
 * @Version 1.0
 **/
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
