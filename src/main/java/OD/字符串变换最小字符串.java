package OD;

/**
 * @Author wanys
 * @Date 2023/3/21 10:42
 * @Version 1.0
 **/
public class 字符串变换最小字符串 {
    public static void main(String[] args) {
        //省去输入与输出
        String str="bcdefa";
        int left=0;
        int right=str.length()-1;
        //找最小字符的位置（将最小的字符移动到开头）
        Character minChar='z';
        int minIndex=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<minChar){
                minChar = str.charAt(i);
                minIndex=i;
            }
        }
        //找到了最小字符串
        if(minIndex==0){
            //不做交换
        }else {
            //交换第0位和minIndex位置
            char[] chars = str.toCharArray();
            Character temp =chars[0];
            chars[0]=chars[minIndex];
            chars[minIndex]=temp;
            str=new String(chars);
        }
        //输出str

    }
}
