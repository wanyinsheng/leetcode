package OD;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author wanys
 * @Date 2023/3/30 11:18
 * @Version 1.0
 **/
public class 考勤信息 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(method(line));

    }

    static boolean method(String str) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] strs = str.split(" ");
        int absent = 0;
        int myCount = 0;
        for (int i = 0; i < strs.length; i++) {
            String cur = strs[i];
            if (cur.equals("absent")) {
                if (++absent > 1) {
                    return false;
                }
            }
            //用栈判断是否有连续早退或者迟到
            if (cur.equals("late") || cur.equals("leaveearly")) {
                if (stack.peek().equals("late") || stack.peek().equals("leaveearly")) {
                    return false;
                } else {
                    myCount++;
                }
            }
            stack.push(cur);
            queue.offer(cur);
            //判断三次以上迟到或早退
            if (queue.size() == 7 && myCount > 3) {
                return false;
            } else {
                String poll = queue.poll();
                if (poll.equals("late") || poll.equals("leaveearly")) {
                    myCount--;
                }
            }

        }
        return true;

    }
}
