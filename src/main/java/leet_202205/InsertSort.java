package leet_202205;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Author wanys
 * @Date 2022/5/20 1:24 AM
 * @Version 1.0
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 11, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
    }

    /**
     * 每次交换都会确定最后一个数
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        //考虑边界条件
        if (arr == null || arr.length < 2) {
            return arr;
        }
        //第一个数已经有序了
        for (int i = 1; i < arr.length; i++) {
            //第i个数和前边的i-1个数依次比较
           int index=i;
            while(index-1>=0&&arr[index-1]>arr[index]){
                swap(index,index-1,arr);
                index--;
            }

        }
        return arr;
    }

    /**
     * 插入排序的优化算法
     * @param arr
     * @return
     */
    public static int[] sort2(int[] arr) {
        //考虑边界条件
        if (arr == null || arr.length < 2) {
            return arr;
        }
        //第一个数已经有序了
        for (int i = 1; i < arr.length; i++) {
            //第i个数和前边的i-1个数依次比较
            for (int j = i-1; j >=0&&arr[j]>arr[j+1] ; j--) {
                swap(j,j+1,arr);
            }

        }
        return arr;
    }


    public static void swap(int i, int j, int[] arr) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
