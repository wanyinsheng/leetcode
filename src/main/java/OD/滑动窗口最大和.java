package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/31 11:03
 * @Version 1.0
 **/
public class 滑动窗口最大和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        int winSize=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[count];
        for(int i=0;i<line.length;i++){
            arr[i]=Integer.parseInt(line[i]);
        }
        //双指针
        int left=0;
        int right=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        while(right<count){
            sum+=arr[right];

            if(right-left<winSize){
                right++;
            }else{
                sum-=arr[left];
                //区间向后移动
                left++;
                right++;
            }
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println(maxSum);



    }

}
