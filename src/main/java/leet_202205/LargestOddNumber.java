package leet_202205;

/**
 * 1903. 字符串中的最大奇数
 * @Author wanys
 * @Date 2022/5/20 5:40 PM
 * @Version 1.0
 **/
public class LargestOddNumber {
    public String largestOddNumber(String num) {
        int n=num.length();
        //从右向左遍历，保证最后一位是0即可
        for (int i = n-1; i >=0 ; i--) {
            if(((int)(num.charAt(i)-'0')&1)==1){
                return num.substring(0, i + 1);
            }
        }
        return "";

    }


}
