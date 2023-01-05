package leet_202301;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1331. 数组序号转换
 * @Author wanys
 * @Date 2023/1/5 15:18
 * @Version 1.0
 **/
public class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        //拷贝到一个待排序数组中
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        int[] ans = new int[arr.length];
        //稠密排序
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {//利用是否已经在集合中进行递增
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;


    }
}
