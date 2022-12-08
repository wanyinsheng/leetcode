package leet_202205;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/5/20 1:05 AM
 * @Version 1.0
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,11,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static  int[] sort(int[] arr){
        //考虑边界条件
        if(arr==null||arr.length<2){
            return arr;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            int minIndex=i;
            for (int j = i; j <arr.length ; j++) {
                //找最小值
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            //和第i个位置交换
            swap(i,minIndex,arr);
        }
        return arr;
    }
    public static void swap(int i,int j,int[] arr){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
}
