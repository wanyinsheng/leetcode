package leet_202205;

import leet_202203.ListNode;

/**
 * @Author wanys
 * @Date 2022/5/20 3:05 PM
 * @Version 1.0
 **/
public class MiddleNode {
    /**
     * 两次遍历，第一次求长度，第二次直接获取节点值
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        //已经获取到链表的长度了
        int i=0;
        while(i<n/2){
            i++;
            head=head.next;

        }
        return head;

    }

}
