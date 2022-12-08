package leet_202208;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 面试题 16.26. 计算器
 * @Author wanys
 * @Date 2022/8/30 15:00
 * @Version 1.0
 **/
public class Calculate {
    public int calculate(String s) {
        //Deque<Integer> stack = new ArrayDeque<Integer>();
        Stack<Integer> stack = new Stack<>();
        char preSign='+';
        int num=0;
        int n=s.length();
        for (int i = 0; i <n ; i++) {
            //找到一个完整的数字
            if(Character.isDigit(s.charAt(i))){
                num=num*10+s.charAt(i)-'0';
            }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' '||i==n-1){
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    default://空格跳过
                        break;
                }
                preSign = s.charAt(i);
                //数字更新为0
                num = 0;
            }
        }
        System.out.println(stack.size());
        int ans=0;
        while(!stack.isEmpty() ){
            ans+=stack.pop();//最后求加减运算
        }
        return ans;
    }

}
