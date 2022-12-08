package leet_202205;

import leet_202203.ListNode;

import java.util.Stack;

/**
 * @Author wanys
 * @Date 2022/5/21 10:13 PM
 * @Version 1.0
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head=null;
        int carry=0;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int a=stack1.isEmpty()?0:stack1.pop();
            int b=stack2.isEmpty()?0:stack2.pop();
            int num=a+b+carry;
            carry=num/10;
            num%=10;
            ListNode node = new ListNode(num);
            //这里直接使用链表来反转
            node.next=head;
            head=node;
        }
        return head;

    }
}
