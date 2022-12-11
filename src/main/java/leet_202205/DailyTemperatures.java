package leet_202205;

import java.util.ArrayDeque;

/**
 * 739. 每日温度
 * @Author wanys
 * @Date 2022/5/25 1:35 AM
 * @Version 1.0
 **/
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] ans=new int[temperatures.length];

        for (int i = 0; i <temperatures.length ; i++) {
            //因为这里需要记录是哪天的天气，所以维护在shatck中，
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                int j=stack.pop();
                ans[j]=i-j;//天数差
            }
            stack.push(i);
        }
        return ans;
    }
}
