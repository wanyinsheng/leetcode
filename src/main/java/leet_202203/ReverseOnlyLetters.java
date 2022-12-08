package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 5:00 PM
 * @Version 1.0
 **/
public class ReverseOnlyLetters {
    /**
     * 双指针法
     *
     * @param s
     * @return
     */
    public String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (true) {
            //左指针从左到右找到数字
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }

            //右指针从右向左找数字
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }
            //退出循环
            if(left>=right)
                break;
            //利用数组交换
            swap(chars,left,right);
            left++;
            right--;
        }
        return new String(chars);

    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}
