package leet_202206;

/**
 * 443. 压缩字符串
 * @Author wanys
 * @Date 2022/6/2 4:36 PM
 * @Version 1.0
 **/
public class Compress {
    public int compress(char[] chars) {
        int len =chars.length;
        int write=0;
        int left=0;
        for(int read=0;read<len;read++){

            //如果是最后一个字符或者和下一个不一样的时候，就说明到了这个字符的最右边
            if (read == len - 1 || chars[read] != chars[read + 1]) {
                //先把字符加进来
                chars[write++] = chars[read];
                int num=read-left+1;//该字符的长度
                if(num>1){
                    int anchor = write;
                    //大于10以上的要按位存储,用取余的方式实现，所以还需要反转数字
                    while(num>0){
                        chars[write++] = (char) (num % 10 + '0');
                        num /= 10;
                    }
                    reverse(chars,anchor,write-1);
                }
                left = read + 1;//一轮结束之后修改左边界
            }
        }
        return write;

    }
    public void reverse(char[] chars,int left,int right){
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
}
