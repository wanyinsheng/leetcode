package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/21 11:57
 * @Version 1.0
 **/
public class 去除多余空格 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //长度判断
        if (line == null || line.length() == 0 || line.length() > 100000) {
            System.out.println("input error");
            return;
        }
        String index=scanner.nextLine();
        String[] splitIndex=index.split(",");
        String[] values=new String[splitIndex.length];
        for (int i = 0; i <splitIndex.length ; i++) {
            
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] charValues = line.toCharArray();
        for(int j=0;j<charValues.length;j++){

        }

    }

}
