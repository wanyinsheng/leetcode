package leet_202205;


import java.util.Arrays;

/**
 * 1859. 将句子排序
 * @Author wanys
 * @Date 2022/5/20 5:06 PM
 * @Version 1.0
 **/
public class SortSentence {

    public String sortSentence(String s) {
        //使用字符串数组保存每个单词，并且是按照顺序的
        int wordCount=0;//单词的个数
        String[] arr=new String[s.length()];
        //因为第一个位置不会为空格
        int left=0;

        //sentence4 a3 is2 This1
        for (int i = 1; i <s.length() ; i++) {
            if(i==s.length()-1){
                wordCount++;
                arr[s.charAt(i)-'0'-1]=s.substring(left,i);
                System.out.println(s.charAt(i)-'0'-1);
                System.out.println(s.substring(left,i));
            }
            if(s.charAt(i)==' '&& s.charAt(i-1)!=' '){
                wordCount++;
                //拆分ab1 wei (1,ab) 插入到数组中
                arr[s.charAt(i-1)-'0'-1]=s.substring(left,i-1);
                System.out.println(s.charAt(i-1)-'0'-1);
                System.out.println(s.substring(left,i-1));
                left=i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<wordCount-1;i++){
            stringBuffer.append(arr[i]).append(" ");
        }
        //拼接最后一个单词
        stringBuffer.append(arr[wordCount-1]);
        return stringBuffer.toString();


    }
}
