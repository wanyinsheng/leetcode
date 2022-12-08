package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/28 9:15 PM
 * @Version 1.0
 **/
public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //就从头到尾遍历求和，即先从个位相加
        ListNode dummyNode = new ListNode(0);
        //前一个节点
        ListNode preNode=dummyNode;
        int carry=0;
        //两个链表有一个不为空，或者右进位
        while(l1!=null||l2!=null||carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            //第二个链表
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            //开始创建新的节点
            preNode.next=new ListNode(sum%10);//指向当前节点，连接起来
            //这里考虑是不是有进位的问题
            carry=sum/10;
            //更新当前节点为上一个节点
            preNode=preNode.next;
        }
        return dummyNode.next;

    }
}
