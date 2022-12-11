package leet_202205;

import leet_202203.ListNode;

/**
 * 2181. 合并零之间的节点
 * @Author wanys
 * @Date 2022/5/21 12:15 PM
 * @Version 1.0
 **/
public class MergeNodes {

    public ListNode mergeNodes(ListNode head) {
        if(head==null)
            return null;
        int sum=0;
        ListNode newNode=head;

        ListNode curr=head.next;//直接从第二个开始
        while(curr!=null){
            if(curr.val==0) {
                ListNode tmp=new ListNode(sum);
                newNode.next=tmp;
                newNode=newNode.next;
                sum=0;
            }
            sum += curr.val;
            curr=curr.next;
        }
        return head.next;

    }

}
