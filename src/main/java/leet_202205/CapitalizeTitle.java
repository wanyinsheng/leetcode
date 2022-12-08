package leet_202205;

/**
 * 2129. 将标题首字母大写
 * @Author wanys
 * @Date 2022/5/20 11:31 PM
 * @Version 1.0
 **/
public class CapitalizeTitle {

    public String capitalizeTitle(String title) {
        //如果单词的长度为 1 或者 2 ，所有字母变成小写。否则，将单词首字母大写，剩余字母变成小写。
        int start=0;//每个单词开始的位置
        //要最源字符串做出修改，这里先变成数组
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <title.length() ; i++) {
            //首位置不可能是空格
            if(title.charAt(i)==' '&&title.charAt(i-1)!=' '){//第i个位置是空格
                if(i-1-start+1<=2){
                    //改成小写
                    builder.append(toString().substring(start,i).toLowerCase()+" ");
                }
                //更新下一个单词的开始位置
                start=i+1;

            }
        }
        int len=0;
        return "";

    }

}
