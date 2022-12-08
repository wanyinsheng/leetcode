package leet_202209;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author wanys
 * @Date 2022/9/18 13:14
 * @Version 1.0
 **/
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int n = pushed.length;
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();

    }
}
