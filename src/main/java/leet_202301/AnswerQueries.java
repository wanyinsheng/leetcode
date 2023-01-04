package leet_202301;

import java.util.Arrays;

/**
 * 2389. 和有限的最长子序列
 * @Author wanys
 * @Date 2023/1/4 21:15
 * @Version 1.0
 **/
public class AnswerQueries {
    //由于题目求的是子序列，且「求和」与元素在数组中的顺序无关，我们可以排序后，从小到大选择尽量多的元素，其元素和不超过询问值。
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i++) {
            nums[i]+=nums[i-1];//原地求前缀和
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <queries.length ; i++) {
            //这里可以使用二分查找，简单的写一个暴力
            int q=queries[i];
            queries[i]=0;//先修改成0 ，避免不下边for循环里边的if
            for (int j = 0; j < nums.length ; j++) {
                if(nums[j]<=q){
                    queries[i]=j+1;
                }else{
                    break;
                }
            }
        }
        return queries;
    }
}
