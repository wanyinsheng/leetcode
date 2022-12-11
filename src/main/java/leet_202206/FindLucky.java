package leet_202206;

import java.util.HashMap;
import java.util.Map;

/**
 * 1394. 找出数组中的幸运数
 *
 * @Author wanys
 * @Date 2022/6/13 10:33 PM
 * @Version 1.0
 **/
public class FindLucky {

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey()==entry.getValue()){
                return entry.getKey();
            }
        }
        return -1;
    }
}
