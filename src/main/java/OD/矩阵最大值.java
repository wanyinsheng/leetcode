package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/21 11:03
 * @Version 1.0
 **/
public class 矩阵最大值 {
    public static void main(String[] args) {
        //遍历每一行找最大值求和  （简单）
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=0;i<num;i++){
            String[] strs=scanner.nextLine().split(",");
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0;j<strs.length;i++){
                stringBuilder.append(strs[j]);
            }
            //针对每一行找二进制最大数
            sum+=find(stringBuilder.toString());
        }


    }

    //找字符串二进制最大值（字符可以整体向左或者向右移动）
    static int find(String str) {
        int len = str.length();
        int max = Integer.parseInt(str, 2);//二进制字符串转成int
        int i = 1;
        while (i++ < len) {
            //不断遍历找到最大的二进制
            String nextStr = str.substring(i) + str.substring(0, i);
            max = Math.max(max,Integer.parseInt(nextStr,2));
        }
        return max;
    }
}
