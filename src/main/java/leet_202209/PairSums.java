package leet_202209;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/9/6 11:09
 * @Version 1.0
 **/
public class PairSums {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            //int num= entry.getKey();
            //获取两个数
            Integer a=map.get(num);
            Integer b=map.get(target-num);
            if(a==null||b==null)
                continue;
            if(target-num==num&&a>0&&b>0){//两个数相等
                if(a>=2){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num);
                    list.add(num);
                    map.put(num,map.get(num)-2);
                    lists.add(list);
                }
            }else if(target-num!=num&&a>0&&b>0){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(target-num);
                map.put(num,map.get(num)-1);
                map.put(target-num,map.get(target-num)-1);
                lists.add(list);
            }
        }

        return lists;
    }
}
