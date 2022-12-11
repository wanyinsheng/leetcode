package leet_202205;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/5/20 1:17 AM
 * @Version 1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,11,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }

    /**
     * 每次交换都会确定最后一个数
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        //考虑边界条件
        if(arr==null||arr.length<2){
            return arr;
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1])
                    swap(j,j+1,arr);
            }
        }
        return arr;
    }


    public static void swap(int i,int j,int[] arr){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }

}
