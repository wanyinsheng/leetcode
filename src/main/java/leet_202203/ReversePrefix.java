package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 5:16 PM
 * @Version 1.0
 **/
public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        //先求出字符的第一个所索引位置
        int index=word.indexOf(ch);
        //如果找到了就需要转
        if(index>0){
            char[] chars = word.toCharArray();
            int left=0;
            int right=index;
            //写一个while循环进行反转
            while(left<right){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            //反转结束
            word=new String(chars);
        }
        return word;

    }
}
