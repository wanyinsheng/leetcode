package OD;

import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2023/3/21 11:50
 * @Version 1.0
 **/
public class 获得完美走位 {
    public static void main(String[] args) {
        //如果不是4的倍数  输出0
        String str="";
        if(str.length()%4!=0){
            System.out.println("0");
        }
        char[] chars = str.toCharArray();
        int length=chars.length;
        int number=length/4;
        HashMap<Character, Integer> map = new HashMap<>();
        //字符串中只能有  ASWD
        for(char ch:chars){
            if(ch!='A'&&ch!='S'&&ch!='D'&&ch!='W'){
                System.out.println("0");
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            //计算大于平均值的数 和小于平均值的数
            //答案就是大于平均值的数或者小于平均值的数

            //另一种方案是直接求绝对值（大于和小于一起求，之后除以2）
        }
    }
}
