package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/24 12:40 PM
 * @Version 1.0
 **/
public class GetKthFromEnd {

    /**
     * 顺序查找
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n=0;
        //先遍历一遍计算链表的长度
        for (ListNode node = head; node!=null ; node=node.next) {
            n++;
        }
        //倒数k个就是正数的n-k
        for(int i=0;i<n-k;i++){
            head=head.next;
        }
        return head;

    }

    /**
     * 双指针，快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        //先将fast移动到第k+1个节点
        while(fast!=null&&k-->0){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
