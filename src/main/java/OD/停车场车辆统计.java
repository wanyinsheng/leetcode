package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/4/12 16:05
 * @Version 1.0
 **/
public class 停车场车辆统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(1000<=line.split(",").length){
            System.out.println(0);
            return;
        }
        int res=0;
        String[] split = line.replaceAll(",", "").split("0+");//用0 去分割
        if(split.length!=0){
            for(String str:split){
                res+=method(str.length());
            }
        }
        System.out.println(res);
    }

    static int method(int len) {
        return (len <= 3 && len >= 1) ? 1 : (int) Math.ceil(len / 3.0);
    }

}
