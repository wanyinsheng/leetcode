package OD;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/21 10:34
 * @Version 1.0
 **/
public class 删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int minVal=Integer.MAX_VALUE;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //找到出现次数最小的
        for(char c:s.toCharArray()){
            int curNum=map.get(c);
            minVal=Math.min(curNum,minVal);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char c :s.toCharArray()){
            if(map.get(c)!=minVal){
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder.toString());


    }
}
