package leet_202204;

import java.util.ArrayList;

/**
 * @Author wanys
 * @Date 2022/4/1 5:02 PM
 * @Version 1.0
 **/
public class FindMinFibonacciNumbers {
    
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//因为可以重复使用，所以这里只放一个1，即1，2，3...
        int a = 1, b = 1;
        while (a + b <= k) {
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        int ans=0;
        for(int i=list.size()-1;i>=0&&k>0;i--) {
            int num = list.get(i);
            //肯定能找到，所以不考虑其他情况
            if (k>=num){
                k-=num;
                ans++;
            }
        }
        return ans;
    }
}
