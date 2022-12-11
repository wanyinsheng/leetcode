package leet_202206;

/**
 * 2231. 按奇偶性交换后的最大数字
 * @Author wanys
 * @Date 2022/6/13 9:57 PM
 * @Version 1.0
 **/
public class LargestInteger {

    public int largestInteger(int num) {
        String s=Integer.toString(num);
        int n=s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                //只有奇偶性相同时才比较
                if((chars[i]-chars[j])%2==0&&chars[i]<chars[j]){
                    char temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        return  Integer.valueOf(new String(chars));

    }

}
