package leet_202206;

/**
 * 剑指 Offer II 018. 有效的回文
 *
 * @Author wanys
 * @Date 2022/6/6 10:27 PM
 * @Version 1.0
 **/
public class IsPalindrome {
    //使用双指针
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //从左边一直找，找到字符或数字停下来
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            //从右边一直找，找到字符或数字停下来
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(left<right){
                //变成小写字母判断是否相等
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                //这两个字符是回文
                left++;
                right--;
            }
        }
        return true;
    }
}
