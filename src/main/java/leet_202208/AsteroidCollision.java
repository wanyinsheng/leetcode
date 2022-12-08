package leet_202208;

import java.util.Stack;

/**
 * @Author wanys
 * @Date 2022/8/1 10:50
 * @Version 1.0
 **/
public class AsteroidCollision {
    public int[]  asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        //Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int aster:asteroids ){
            boolean alive = true;
            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -aster; // aster 是否存在
                if (stack.peek() <= -aster) {  // 栈顶行星爆炸
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(aster);
            }
        }
        int size = stack.size();
        int[] ans = new int[size];
        //栈 倒序
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;

    }
}
