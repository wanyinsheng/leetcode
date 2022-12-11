package leet_202207;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2022/7/4 2:29 下午
 * @Version 1.0
 **/
public class CountElements {

    public int countElements(int[] nums) {

        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        int res=0;
        //先找最大值和最小值
        for(int num:nums){
            if(num<small){
                small=num;
            }else if(num>big){
                big=num;
            }
        }
        for(int num:nums){
            if(small<num&&num<big)
                res++;
        }
        return res;
    }
}
