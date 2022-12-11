package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 9:48 AM
 * @Version 1.0
 **/
public class GetIntersectionNode01 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        //做出两个遍历的指针
        ListNode pA=headA;
        ListNode pB=headB;
        while(pA!=pB){
            pA=(pA==null?headB:pA.next);
            pB=(pB==null?headA:pB.next);
        }
        return pA;
    }
}
