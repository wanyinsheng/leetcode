package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/21 12:12
 * @Version 1.0
 **/
public class 数据分类 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int c=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int[] arr=new int[b-1];
        for(int i=2;i<s.length;i++){
            int res=method(Integer.parseInt(s[i]))%b;
            if(res<c){
                arr[res]++;
            }
        }
        int result=-1;
        for(int i=0;i<arr.length;i++){
            result=Math.max(result,arr[i]);
        }
        System.out.println(result);

    }

    public static int method(int num) {
        String s = Integer.toBinaryString(num);
        int sum = 0;
        //
        while (s.length() > 8) {
            String temp = s.substring(s.length() - 8);
            sum += Integer.parseInt(temp);
            s = s.substring(0, s.length() - 8);
        }
        sum += Integer.parseInt(s);
        return sum;
    }
}
