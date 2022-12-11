package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 9:19 AM
 * @Version 1.0
 **/
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA=headA;
        ListNode pB=headB;
        while (pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }
}
