package leet_202205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/5/3 6:12 PM
 * @Version 1.0
 **/
public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minDiff=0;
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        for (int i = 0; i <arr.length-1 ; i++) {
            if(minDiff>arr[i+1]-arr[i]){
                minDiff=arr[i+1]-arr[i];
            }
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(minDiff==arr[i+1]-arr[i]){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res;
    }
}
