package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/24 11:12 AM
 * @Version 1.0
 **/
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){//避免空指针异常
            slow=slow.next;
            fast=fast.next.next;
            //如果相遇了，说明有环，开始寻找环的入口
            if(slow==fast){
                //相遇的节点
                ListNode b=fast;
                //头节点
                ListNode a=head;
                while(a!=b){
                    a=a.next;
                    b=b.next;
                }
                return a;

            }


        }
        return null;//无环
    }
}
