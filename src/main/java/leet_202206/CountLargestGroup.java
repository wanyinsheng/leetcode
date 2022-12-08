package leet_202206;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/6/14 10:14 PM
 * @Version 1.0
 **/
public class CountLargestGroup {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxValue=0;
        for (int i = 1; i <=n ; i++) {
            int key=0;//key为i的的各位之和
            int num=i;
            //求i的各位和
            while(num!=0){
                key+=num%10;
                num/=10;
            }
            map.put(key,map.getOrDefault(key, 0) + 1);
            maxValue=Math.max(maxValue,map.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvpair : map.entrySet()) {
            if (kvpair.getValue() == maxValue) {
                ++count;
            }
        }
        return count;
    }

}
