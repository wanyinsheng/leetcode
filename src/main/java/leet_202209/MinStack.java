package leet_202209;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author wanys
 * @Date 2022/9/18 12:57
 * @Version 1.0
 **/
public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList<>();//stack=new ArrayDeque<>();
        minStack = new LinkedList<>();
        //初始化一个最大值
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        //更新最小栈
        minStack.push(Math.min(x, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return  minStack.peek();
    }
}
