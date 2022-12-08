package leet_202205;

import leet_202203.ListNode;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * @Author wanys
 * @Date 2022/5/21 2:43 PM
 * @Version 1.0
 **/
public class KthToLast {
    /**
     * 双指针
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && k-- >0){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.val;
    }

}
