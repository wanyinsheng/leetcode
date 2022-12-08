package leet_202203;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author wanys
 * @Date 2022/3/28 8:40 PM
 * @Version 1.0
 **/
public class DecodeString {
    /**
     * 栈操作
     * 如果当前的字符为数位，解析出一个数字（连续的多个数位）并进栈
     * 如果当前的字符为字母或者左括号，直接进栈
     * 如果当前的字符为右括号，开始出栈，一直到左括号出栈，出栈序列反转后拼接成一个字符串，此时取出栈顶的数字（此时栈顶一定是数字，想想为什么？），就是这个字符串应该出现的次数，我们根据这个次数和字符串构造出新的字符串并进栈
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/decode-string/solution/zi-fu-chuan-jie-ma-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     *
     * 2[a2[bc]]
     * @param s
     * @return
     */
    int ptr;//当前索引，做成全局的，别的方法需要访问

    public String decodeString(String s) {
        ptr = 0;
        LinkedList<String> stack = new LinkedList<String>();
        while (ptr < s.length()) {
            char curr = s.charAt(ptr);
            if (Character.isDigit(curr)) {//是数字
                String digits = getDegits(s);
                stack.addLast(digits);
            } else if (Character.isLetter(curr)) {//是字母
                stack.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> subs = new LinkedList<String>();
                while (!"[".equals(stack.peekLast())) {
                    subs.addLast(stack.removeLast());
                }
                //已经取出了中间的bc
                Collections.reverse(subs);
                //左括号出栈
                stack.removeLast();
                //此时栈顶就是sub的次数，这里是2
                int count = Integer.parseInt(stack.removeLast());
                StringBuilder stringBuilder = new StringBuilder();
                //这里需要将list转成String
                String sub = listToString(subs);
                while(count-->0){
                    stringBuilder.append(sub);
                }
                //小串解决完毕
                //入栈继续操作
                stack.addLast(stringBuilder.toString());

            }
        }

        return null;
    }

    public String getDegits(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        while (Character.isDigit(s.charAt(ptr))) {
            stringBuilder.append(s.charAt(ptr++));//取数并向后移动
        }
        return stringBuilder.toString();//找到一个完整的数字
    }
    public String listToString(LinkedList<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s :list){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
