package leet_202209;

import java.util.Random;

/**
 * @Author wanys
 * @Date 2022/9/7 09:46
 * @Version 1.0
 **/
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        //假设按照峰-谷-峰的顺序排列数组，那么遍历一遍数组：
        //第一个就是峰
        for (int i = 1; i <nums.length ; i++) {
            if(i%2==0){//峰
                if(nums[i]<nums[i-1])
                    swap(nums,i,i-1);
            }else{
                if(nums[i]>nums[i-1])
                    swap(nums,i,i-1);
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i <17 ; i++) {
            int min = new Random().nextInt(29);
            while(String.valueOf(min).length()==1){
                min = new Random().nextInt(29);
            }
            min=min+30;
            int hour = new Random().nextInt(2);
            hour=22;

            System.out.println(hour+":"+min);
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println();
        }
        for (int i = 0; i <17 ; i++) {
            int di = 100;
            int to = new Random().nextInt(5);
            int sum=di+to;
            System.out.println(sum);
        }

    }
}
