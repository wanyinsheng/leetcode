package leet_202205;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 232. 用栈实现队列
 * @Author wanys
 * @Date 2022/5/20 2:08 PM
 * @Version 1.0
 **/
public class MyQueue {

    Deque<Integer> inStack;
    Deque<Integer> outStack;
    public MyQueue() {
        inStack=new ArrayDeque<>();
        outStack=new ArrayDeque<>();

    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()){
            inToOut();
        }
        return outStack.pop();

    }

    public int peek() {
        if(outStack.isEmpty()){
            inToOut();
        }
        return outStack.peek();

    }

    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }
    public  void inToOut(){
        while(!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }

    }
}
