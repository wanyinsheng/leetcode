package leet_202204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/4/1 4:01 PM
 * @Version 1.0
 **/
public class CanReorderDoubled {

    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //对于arr 中的 0，它只能与0 匹配。如果 是奇数个，那么必然无法满足题目要求。
        if(map.getOrDefault(0,0)%2!=0)
            return false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int k:map.keySet()){
            list.add(k);
        }
        //按绝对值升序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1)-Math.abs(o2);
            }
        });
        for(int val:list){
            //没有足够的2x与x配对，失败
            if(map.getOrDefault(2*val,0)<map.get(val)){
                return false;
            }
            map.put(2*val,map.getOrDefault(2*val,0)-map.get(val));
        }
        return true;
    }
}
