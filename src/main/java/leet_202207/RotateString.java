package leet_202207;

/**
 * 796. 旋转字符串
 *
 * @Author wanys
 * @Date 2022/7/1 3:58 下午
 * @Version 1.0
 **/
public class RotateString {

    public boolean rotateString(String s, String goal) {
        //长度相等并且拼接过之后会出现goal的子串
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
